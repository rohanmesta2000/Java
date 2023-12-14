package com.xworkz.runner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/flipkart", loadOnStartup = 9)
public class ServerRunner extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String slNo = req.getParameter("slNo");
		String fName = req.getParameter("fName");
		String lName = req.getParameter("lName");
		String mName = req.getParameter("mName");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String area = req.getParameter("area");
		String district = req.getParameter("district");
		String state = req.getParameter("state");
		String pincode = req.getParameter("pincode");

		System.out.println(slNo);
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(mName);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(area);
		System.out.println(district);
		System.out.println(state);
		System.out.println(pincode);

		req.setAttribute("slNo", slNo);
		req.setAttribute("fName", fName);
		req.setAttribute("lName", lName);
		req.setAttribute("mName", mName);
		req.setAttribute("email", email);
		req.setAttribute("gender", gender);
		req.setAttribute("area", area);
		req.setAttribute("district", district);
		req.setAttribute("state", state);
		req.setAttribute("pincode", pincode);

		System.out.println("server details sent successfully");
		RequestDispatcher dispatcher = req.getRequestDispatcher("serverSuccess.jsp");
		dispatcher.forward(req, resp);

	}

}
