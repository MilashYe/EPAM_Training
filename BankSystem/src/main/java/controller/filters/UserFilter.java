package controller.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();

		String role = (String) session.getAttribute("role");


		if(!checkPermission(role)){
			throw new RuntimeException("You don`t have permission to visit user page");
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
		return role.equals("user");
	}
}
