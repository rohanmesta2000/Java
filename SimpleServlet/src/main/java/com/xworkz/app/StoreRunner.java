package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StoreRunner  extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String productName = request.getParameter("productName");
	        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
	        String productType = request.getParameter("productType");

	        double discount = 0;
	        switch (productType) {
	            case "cloth":
	                discount = 0.10;
	                break;
	            case "book":
	                discount = 0.15;
	                break;
	            case "electric":
	                discount = 0.07;
	                break;
	            default:
	                discount = 0.05;
	        }

	        double discountedPrice = productPrice - (productPrice * discount);

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("Product Name: " + productName );
	        out.println("Product Type: " + productType );
	        out.println("Original Price: " + productPrice );
	        out.println("Discount Percentage: " + (discount * 100) );
	        out.println("Discounted Price: " + discountedPrice );
	       
	    }
	}

