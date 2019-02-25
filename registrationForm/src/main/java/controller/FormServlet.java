package controller;

import model.Registration.Notebook;
import model.Registration.Record;
import org.omg.CORBA.NO_IMPLEMENT;
import view.TextConstants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/registration")
public class FormServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str = "<html>" +
				"<body>" +
				"hi get" +
				"</body>" +
				"</html>";
		resp.getWriter().write(str);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.process(req,resp);

	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setStatus(HttpServletResponse.SC_OK);
		ArrayList<String> record = new ArrayList<String>();

		PrintWriter pw = response.getWriter();
		Enumeration en = request.getParameterNames();
		record.add(readInput("name",request));
		record.add(readInput("surname",request));
		record.add(readInput("nickname",request));
		record.add(readInput("comment",request));
		record.add(readInput("homePhone",request));
		record.add(readInput("mobilePhone1",request));
		record.add(readInput("mobilePhone2",request));
		record.add(readInput("eMail",request));
		record.add(readInput("skype",request));
		record.add(readInput("index",request));
		record.add(readInput("city",request));
		record.add(readInput("street",request));
		record.add(readInput("house",request));
		record.add(readInput("apartment",request));
		//record.add(readInput(TextConstants.INPUT_DATE, Regex.DATE_REGEX,request,response));
		Notebook notebook = Notebook.getInstance();
		Record r = new Record(record);

		notebook.addRecord(r);
		response.getWriter().write(notebook.toString());

		//System.out.println(notebook.toString());
	}
	public boolean validate(String regex, String validationInput) {
		return validationInput.matches(regex);
	}

	public boolean checkForIntegrity(ArrayList<String> arrayList, int countOfLines) {
		return arrayList.size() == countOfLines;
	}

	public String readInput(String name,
							HttpServletRequest request) throws IOException{

		return request.getParameter(name);

	}
}
