package controller.command;

import com.sun.deploy.net.HttpRequest;
import model.logic.CoffeeCreator;

import javax.servlet.http.HttpServletRequest;

public class AddCommand implements Command {

	@Override
	public String execute(HttpServletRequest req) {
		String type = req.getParameter("type");
		long price = Long.parseLong(req.getParameter("price"));
		long weight = Long.parseLong(req.getParameter("weight"));
		int grindSize = Integer.parseInt(req.getParameter("grindSize"));
		int quality = Integer.parseInt(req.getParameter("quality"));
		String taste = req.getParameter("taste");
		String beanType = req.getParameter("beanType");

		new CoffeeCreator().createCoffee(type, price, weight, grindSize, quality, taste, beanType);

		return "/index.jsp";
	}
}
