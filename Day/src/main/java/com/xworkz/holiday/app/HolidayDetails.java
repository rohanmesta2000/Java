package com.xworkz.holiday.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rohan",loadOnStartup = 3)
public class HolidayDetails  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String date=req.getParameter("date");
		 String month=req.getParameter("month");
		 String year=req.getParameter("year");
		 String days=req.getParameter("days");
		 
		req.getHttpServletMapping("name")
	}
}
