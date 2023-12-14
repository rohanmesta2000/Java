package com.xworkz.weapon.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/rohan",loadOnStartup = 5)
public class BaseWeapon  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String madeBy=req.getParameter("madeBy");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		
		
		System.out.println("Name" +name);
		System.out.println("Made By" +madeBy);
		System.out.println("Price"+price);
		System.out.println("Type" +type);
		
		int convertedprice=Integer.parseInt(price);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		writer.print("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Military</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "   <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button\r\n"
				+ "      class=\"navbar-toggler\"\r\n"
				+ "      type=\"button\"\r\n"
				+ "      data-mdb-toggle=\"collapse\"\r\n"
				+ "      data-mdb-target=\"#navbarNav\"\r\n"
				+ "      aria-controls=\"navbarNav\"\r\n"
				+ "      aria-expanded=\"false\"\r\n"
				+ "      aria-label=\"Toggle navigation\"\r\n"
				+ "    >\r\n"
				+ "      <i class=\"fas fa-bars\"></i>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "      <ul class=\"navbar-nav\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Weapon</a>\r\n"
				+ "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"weapon.html\">Home</a>\r\n"
				+ "        </li>\r\n"
				+ "       \r\n"
				+ "      </ul>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
		
		writer.println("</br> Name :" + name);
		writer.println("</br> Made By :" + madeBy);
		writer.println("</br> Price :"+ price);
		writer.println("</br> Type :" + type);
		

		if(convertedprice>4) {
			writer.print("</br><span  style ='color:green;'>price is proper...");
			
		}else {
			writer.print("</br><span  style ='color:red;'>price is improper...");
		}
		
		
	}



}
