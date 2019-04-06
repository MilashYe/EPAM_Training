package controller.command.impl.guest;

import controller.Regex;
import controller.command.Command;
import controller.command.impl.PrivateAccountPageCommand;
import model.service.encryption.JBCrypt;
import model.service.encryption.PasswordService;
import model.dao.DAOFactory;
import model.dao.GenericDAO;
import model.entity.ROLE;
import model.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

public class RegistrationSubmitCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		boolean submited = false;
		String login =  checkValid(request.getParameter("registrationLogin"), Regex.LOGIN_REGEX);
		String name =  checkValid(request.getParameter("registrationName"), Regex.NAME_REGEX);
		String surname =  checkValid(request.getParameter("registrationSurname"), Regex.NAME_REGEX);
		String phone = checkValid(request.getParameter("registrationPhone"), Regex.MOBILE_PHONE_REGEX);
		String pwd = checkValid(request.getParameter("registrationPwd"), ".+");

		ArrayList<String> arrayUser = new ArrayList<>();
		arrayUser.add(login);
		arrayUser.add(name);
		arrayUser.add(surname);
		arrayUser.add(phone);
		arrayUser.add(pwd);

		System.out.println(arrayUser);

		int elementCount = 0;
		for ( String p : arrayUser ) {
			if ( p == null ) {
				continue;
			}
			elementCount++;
		}
		if ( elementCount == arrayUser.size() ) {
			submited = true;
		}

		if ( submited ) {
			User user = new User();
			user.setLogin(login);
			user.setName(name);
			user.setSurname(surname);
			user.setPhone(phone);
			PasswordService pwdService = new JBCrypt();
			user.setPwdHash(pwdService.createHash(pwd));
			user.setRole(ROLE.USER);
			request.getSession().setAttribute("role", user.getRole());
			GenericDAO dao = DAOFactory.getInstance().createUserDAO();
			dao.create(user);

			return new PrivateAccountPageCommand().execute(request);
		}else {
			request.getSession().setAttribute("userLogin", login);
			request.getSession().setAttribute("userName", name);
			request.getSession().setAttribute("userSurname", surname);
			request.getSession().setAttribute("userPhone", phone);

			return "/registration.jsp";
		}
	}

	private String checkValid(String str, String regex) {
		boolean checked = false;
		try {
			checked = str.matches(regex);
		} catch ( PatternSyntaxException e ) {
			e.printStackTrace();
		}
		if ( checked ) {
			return str;
		} else {
			return null;
		}

	}
}
