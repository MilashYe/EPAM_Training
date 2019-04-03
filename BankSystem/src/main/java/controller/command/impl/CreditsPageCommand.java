package controller.command.impl;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class CreditsPageCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		return "/credit.jsp";
	}
}
