package controller;

import controller.command.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet
public class CoffeeServlet extends HttpServlet {
	private Map<String, Command> commands = new HashMap<>();

	@Override
	public void init() throws ServletException {

		commands.put("main", new MainPageCommand());
		commands.put("add", new AddCommand());
		commands.put("show", new ShowCommand());
		commands.put("range", new RangeCommand());
		commands.put("sort", new SortCommand());
		commands.put("changeLang", new ChangeLangCommand());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		System.out.println("get");
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		System.out.println("post");
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException  {
		String path = request.getRequestURI();
		System.out.println("path URI "+path);
		path = path.replaceAll(".*/coffeeServlet/" , "");

		System.out.println(path);
		Command command = commands.get(path);
		String page = command.execute(request);
		System.out.println("page="+page);
		request.getRequestDispatcher(page).forward(request,response);
	}
}
