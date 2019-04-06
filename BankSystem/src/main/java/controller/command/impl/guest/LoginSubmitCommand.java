package controller.command.impl.guest;

import controller.command.Command;
import controller.command.impl.PrivateAccountPageCommand;
import model.service.encryption.JBCrypt;
import model.service.encryption.PasswordService;
import model.dao.DAOFactory;
import model.dao.GenericDAO;
import model.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class LoginSubmitCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		GenericDAO<User> dao = DAOFactory.getInstance().createUserDAO();

		String login = request.getParameter("login");
		String pwd = request.getParameter("password");

		Optional<User> optionalUser = Optional.of(dao.readByString(login));


		User user = optionalUser.orElse(new User());
		PasswordService pwdService = new JBCrypt();
		boolean check = pwdService.checkPwd(pwd, user.getPwdHash());

		if(check){
			request.getSession().setAttribute("role",user.getRole());
			/*request.getSession().setAttribute("user", user);
			*/return new PrivateAccountPageCommand().execute(request);
		}else {
			return "/login.jsp";
		}

	}
}
