package com.xworkz.farmer.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rohan", loadOnStartup = 5)
public class FarmerResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String acres = req.getParameter("acres");
		String soilType = req.getParameter("soilType");
		String cropType = req.getParameter("cropType");
		String season = req.getParameter("season");
		String investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String rtno = req.getParameter("rtno");

		System.out.println("Name:" + name);
		System.out.println("Acres:" + acres);
		System.out.println("SoilType:" + soilType);
		System.out.println("Crop:" + cropType);
		System.out.println("Season:" + season);
		System.out.println("Investment:" + investment);
		System.out.println("Profit:" + profit);
		System.out.println("RTNo:" + rtno);

		double convertedInvestment = Double.parseDouble(investment);
		float convertedProfit = Float.parseFloat(profit);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Home</title>\r\n" + "  </head>\r\n" + "  <body>\r\n" + "  \r\n"
				+ "<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n" + "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n" + "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n"
				+ "      <div class=\"navbar-nav\">\r\n"
				+ "        <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home</a>\r\n"
				+ "        <a class=\"nav-link\" href=\"farmer.html\">Farmer</a>\r\n" + "      </div>\r\n"
				+ "    </div>\r\n" + "  </div>\r\n" + "</nav>\r\n" + "  </body>\r\n" + "</html> ");
		writer.println("</br> Name:" + name);
		writer.println("</br> Acres:" + acres);
		writer.println("</br> SoilType:" + soilType);
		writer.println("</br> Crop:" + cropType);
		writer.println("</br> Season:" + season);
		writer.println("</br> Investment:" + investment);
		writer.println("</br> Profit:" + profit);
		writer.println("</br> RTNo:" + rtno);
		
		if(convertedProfit>convertedInvestment) {
			writer.print("</br><span  style ='color:green;'>It is good year...");
			
		}else {
			writer.print("</br><span  style ='color:red;'>It is not a good year...");
		}

	}
}
