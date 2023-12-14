package com.xworkz.set.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/works", loadOnStartup = 9)
public class PageResource extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mobileNumber = req.getParameter("mobileNumber");
		String email = req.getParameter("email");
		String dob=req.getParameter("dob");
		String location=req.getParameter("location");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
		req.setAttribute("name", name);
		req.setAttribute("mobileNumber", mobileNumber);
		req.setAttribute("email", email);
		req.setAttribute("dob", dob);
		req.setAttribute("location", location);
		req.setAttribute("password", password);
		req.setAttribute("confirmPassword", confirmPassword);
		

RequestDispatcher dispatcher1 = req.getRequestDispatcher("page.jsp");
dispatcher1.forward(req, resp);
		
	}

}
