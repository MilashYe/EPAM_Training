package controller;

import controller.command.Command;
import controller.command.impl.*;
import controller.command.impl.guest.LoginPageCommand;
import controller.command.impl.guest.LoginSubmitCommand;
import controller.command.impl.guest.RegistrationPageCommand;
import controller.command.impl.guest.RegistrationSubmitCommand;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/bank/*")
public class Servlet extends HttpServlet {
	private static final Logger log = Logger.getLogger(Servlet.class);
	private Map<String, Command> commands = new HashMap<>();

	@Override
	public void init() throws ServletException {

		commands.put("main", new MainPageCommand());
		commands.put("registrationPage", new RegistrationPageCommand());
		commands.put("loginpage", new LoginPageCommand());
		commands.put("deposits", new DepositsPageCommand());
		commands.put("credits", new CreditsPageCommand());
		commands.put("register", new RegistrationSubmitCommand());
		commands.put("login", new LoginSubmitCommand());


		commands.put("admin/main", new MainPageCommand());
		commands.put("admin/privateAccount", new PrivateAccountPageCommand());
		commands.put("admin/logout", new LogoutCommand());


		commands.put("user/main", new MainPageCommand());
		commands.put("user/deposits", new DepositsPageCommand());
		commands.put("user/credits", new CreditsPageCommand());
		commands.put("user/privateAccount", new PrivateAccountPageCommand());
		commands.put("user/logout", new LogoutCommand());

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proccess(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proccess(req,resp);
	}

	private void proccess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getRequestURI().replaceAll(".*/bank/", "");
		log.info("path:" + path);
		Command command = commands.getOrDefault(path, (r)->"/main.jsp");
		String page = command.execute(req);
		log.info("page:" + page);

		if ( page.contains("redirect") ) {
			resp.sendRedirect(page.replaceAll("redirect:", ""));
			log.info("redirect: " + page);
		} else {
			req.getRequestDispatcher(page).forward(req, resp);
			log.info("forward: " + page);
		}


	}


}
