package controller.command.impl.guest;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class LoginPageCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		return "/login.jsp";
	}
}
