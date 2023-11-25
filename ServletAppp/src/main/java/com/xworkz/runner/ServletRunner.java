package com.xworkz.runner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rohan" , loadOnStartup = 5)
public class ServletRunner extends HttpServlet {


@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String siNo=req.getParameter("siNo");
String Fname=req.getParameter("Fname");
String Lname=req.getParameter("Lname");
String Mname=req.getParameter("Mname");
String Email=req.getParameter("Email");
String gender=req.getParameter("gender");
String contactNo=req.getParameter("contactNo");
String area=req.getParameter("area");
String distic=req.getParameter("distic");
String pincode=req.getParameter("pincode");

System.out.println(siNo);
System.out.println(Fname);
System.out.println(Lname);
System.out.println(Mname);
System.out.println(Email);
System.out.println(gender);
System.out.println(contactNo);
System.out.println(area);
System.out.println(distic);
System.out.println(pincode);


int convetedSiNo=Integer.parseInt(siNo);
long convertedContactNo=Long.parseLong(contactNo);
long convertedPincode= Long.parseLong(pincode);
int convertedArea=Integer.parseInt(area);

req.setAttribute("siNo", siNo);
req.setAttribute("Fname", Fname);
req.setAttribute("Lname", Lname);
req.setAttribute("Mname", Mname);
req.setAttribute("Email", Email);
req.setAttribute("gender", gender);
req.setAttribute("contactNo", contactNo);
req.setAttribute("area", area);
req.setAttribute("distic", distic);
req.setAttribute("pincode", pincode);
}

}






