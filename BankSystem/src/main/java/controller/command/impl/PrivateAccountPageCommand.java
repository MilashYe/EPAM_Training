package controller.command.impl;

import controller.command.Command;
import model.entity.User;

import javax.servlet.http.HttpServletRequest;

public class PrivateAccountPageCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {

		if ( request.getSession().getAttribute("role") == "user" ) {

			return "/view/user/userInfo.jsp";
		} else if ( request.getSession().getAttribute("role") == "admin" ) {
			return "/view/admin/adminMain.jsp";
		} else {
			return "/login.jsp";
		}

	}
}
