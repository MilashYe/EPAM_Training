package controller.filters;

import controller.command.Command;
import controller.command.impl.*;
import controller.command.impl.guest.LoginPageCommand;
import controller.command.impl.guest.LoginSubmitCommand;
import controller.command.impl.guest.RegistrationPageCommand;
import controller.command.impl.guest.RegistrationSubmitCommand;
import model.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

@WebFilter(urlPatterns = "/bank/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();

		String role = (String) session.getAttribute("role");


		if(!checkPermission(role)){
			throw new RuntimeException("You don`t have permission to visit admin page");
		}


		/*String uRole = (String) req.getSession().getAttribute("role");
		if ( uRole == null ) {
			req.getSession().setAttribute("commands", guestCommands);
		} else if ( uRole.equals("user") ) {
			req.getSession().setAttribute("commands", userCommands);
		} else if (uRole.equals("admin") ) {
			req.getSession().setAttribute("commands", adminCommands);
		}*/
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {

	}

	private boolean checkPermission(String role) {
		if(role == null) return false;
		return role.equals("admin");
	}
}
