package controller.command.impl;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class RegistrationSubmitCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		if ( true ) {
			System.out.println(request.getParameter("registrationLogin"));
			System.out.println(request.getParameter("registrationPhone"));
			System.out.println(request.getParameter("registrationPwd"));
			System.out.println(request.getRequestURI());
			request.getSession().setAttribute("role", "user");

			return new PrivateAccountPageCommand().execute(request);
		}else {
			return "/registration.jsp";
		}
	}
}
