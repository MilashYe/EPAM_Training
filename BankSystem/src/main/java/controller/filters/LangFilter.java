package controller.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Locale;


public class LangFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		Locale locale;

		if ( request.getParameter("locale") != null ) {
			System.out.println("locale"+request.getParameter("locale"));
			req.getSession().setAttribute("lang",
					request.getParameter("locale"));/*
			locale = new Locale(request.getParameter("locale"));
			response.setLocale(locale);*/
		}


		chain.doFilter(request,response);
	}

	@Override
	public void destroy() {

	}
}
