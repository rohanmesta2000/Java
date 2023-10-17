package com.xworkz.police.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rohan", loadOnStartup = 4)
public class PoliceStationResource extends HttpServlet {

	public PoliceStationResource() {
	System.out.println("Created PoliceStationResource");
	}
	@Override
protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
	String name=req.getParameter("name");
	String headConstable=req.getParameter("headConstable");
	String location=req.getParameter("location");
	String assistantCommissioner=req.getParameter("assistantCommissioner");
	String inspectorName=req.getParameter("inspectorName");
	Integer numberOfCells=Integer.parseInt(req.getParameter("noOfCells"));
	
	String SIName=req.getParameter("SIName");
	String noOfCasePending=req.getParameter("noOfCasePending");
	String painted=req.getParameter("painted");
	
	
	System.out.println("Name"+name);
	System.out.println("HeadConstable"+headConstable);
	System.out.println("Location"+location);
	System.out.println("AssistantCommissioner"+assistantCommissioner);
	System.out.println("InspectorName"+inspectorName);
	System.out.println("NumberOfCells"+numberOfCells);
	System.out.println("SIName"+SIName);
	System.out.println("NoOfCasePending"+noOfCasePending);
	System.out.println("Painted"+painted);
	
	int convertedNoOfCasesPending=Integer.parseInt(noOfCasePending);
	boolean convertedPainted=Boolean.parseBoolean(painted);
	
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	
	writer.print("<!doctype html>\r\n"
			+ "<html lang=\"en\">\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"utf-8\">\r\n"
			+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
			+ "<title>Security</title>\r\n"
			+ "<link\r\n"
			+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
			+ "	rel=\"stylesheet\"\r\n"
			+ "	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
			+ "	crossorigin=\"anonymous\">\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "	<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n"
			+ "		<div class=\"container-fluid\">\r\n"
			+ "			<a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
			+ "			<button class=\"navbar-toggler\" type=\"button\"\r\n"
			+ "				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n"
			+ "				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n"
			+ "				aria-label=\"Toggle navigation\">\r\n"
			+ "				<span class=\"navbar-toggler-icon\"></span>\r\n"
			+ "			</button>\r\n"
			+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
			+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
			+ "					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
			+ "						aria-current=\"page\" href=\"index.html\">Home</a></li>\r\n"
			+ "					<li class=\"nav-item\"><a class=\"nav-link\" href=\"station.html\">Police\r\n"
			+ "							Station</a></li>\r\n"
			+ "				</ul>\r\n"
			+ "\r\n"
			+ "			</div>\r\n"
			+ "		</div>\r\n"
			+ "	</nav>\r\n"
			+ "	<h1>Karnataka State Police</h1>\r\n"
			+ "	<h4>Government Of Karnataka</h4>\r\n"
			+ "	<script\r\n"
			+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
			+ "		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
			+ "		crossorigin=\"anonymous\"></script>\r\n"
			+ "</body>\r\n"
			+ "</html>");
	
	writer.println("</br> Name"+name);
	writer.println("</br>HeadConstable"+headConstable);
	writer.println("</br> Location"+location);
	writer.println("</br> AssistantCommissioner"+assistantCommissioner);
	writer.println("</br>InspectorName"+inspectorName);
	writer.println("</br>NumberOfCells"+numberOfCells);
	writer.println("</br>SIName"+SIName);
	writer.println("</br>NoOfCasePending"+noOfCasePending);
	writer.println("</br>Painted"+painted);
	
	
	if(convertedNoOfCasesPending>4) {
		writer.print("</br><span  style ='color:green;'>many cases are pending...");
		
	}else {
		writer.print("</br><span  style ='color:red;'>less cases are pending...");
	}
	
	if(numberOfCells>5) {
		writer.print("</br><span  style ='color:green;'>It is a Big Station");
		
	}else {
		writer.print("</br><span  style ='color:red;'>It is a Small Station");
	}

	
	if(convertedPainted==true) {
writer.print("</br><span  style ='color:green;'>It ");
		
	}else {
		writer.print("</br><span  style ='color:red;'>It is a Small Station");
	}
	
	
}
}
