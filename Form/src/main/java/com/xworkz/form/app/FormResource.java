package com.xworkz.form.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(urlPatterns = "/form", loadOnStartup = 9)
public class FormResource extends HttpServlet{
	String name = req.getParameter("name");

}
