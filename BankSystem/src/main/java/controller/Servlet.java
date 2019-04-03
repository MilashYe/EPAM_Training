package controller;

import controller.command.Command;
import controller.command.impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/app/*")
public class Servlet extends HttpServlet {
	private Map<String, Command> commands = new HashMap<>();

	@Override
	public void init() throws ServletException {
		commands.put("registrationPage", new RegistrationPageCommand());
		commands.put("main", new MainPageCommand());
		commands.put("deposits", new DepositsPageCommand());
		commands.put("credits", new CreditsPageCommand());
		commands.put("registration", new RegistrationPageCommand());
		commands.put("loginpage", new LoginPageCommand());
		commands.put("privateAccount", new PrivateAccountPageCommand());
		commands.put("registrate", new RegistrationSubmitCommand());
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
		System.out.println(req.getRequestURI());
		String path = req.getRequestURI().replaceAll(".*/app/", "");
		System.out.println(path);
		Command command = commands.getOrDefault(path, (r)->"/main.jsp");
		String page = command.execute(req);
		if ( page.contains("redirect") ) {
			resp.sendRedirect(page.replaceAll("redirect:", ""));
		} else {
			req.getRequestDispatcher(page).forward(req, resp);
		}


	}


}
