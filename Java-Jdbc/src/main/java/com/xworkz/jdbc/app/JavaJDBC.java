package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBC {

	public static void main(String[] args) {
		System.out.println("Invoking main in JaVAjdbc");

		String jdbcUrl = "jdbc:mysql://localhost:3306/JDBC";
		String userName = "root";
		String password = "Rohanme1@";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		System.out.println("Establishing a connection...");
		String query = "INSERT INTO location(id,name,city,state,pincode) VALUES(1,'rajaji nagar','Banglore','karntaka',567890)";
		String query1 = "INSERT INTO location(id,name,city,state,pincode) VALUES(2,'vinay nagar','Banglore','karntaka',560010)";
		String query2 = "INSERT INTO location(id,name,city,state,pincode) VALUES(3,'vijaynagar','Banglore','karntaka',560010)";
		String query3 = "INSERT INTO location(id,name,city,state,pincode) VALUES(4,'shivaji nagar','Banglore','karntaka',560010)";
		String query4 = "INSERT INTO location(id,name,city,state,pincode) VALUES(5,'majestic','Banglore','karntaka',560010)";
		String query5 = "INSERT INTO location(id,name,city,state,pincode) VALUES(6,'kr market','Banglore','karntaka',560010)";
		String query6 = "INSERT INTO location(id,name,city,state,pincode) VALUES(7,'hassur','Banglore','karntaka',560010)";
		String query7 = "INSERT INTO location(id,name,city,state,pincode) VALUES(8,'vinay nagar','Banglore','karntaka',560010)";
		String query8 = "INSERT INTO location(id,name,city,state,pincode) VALUES(9,'vinay nagar','Banglore','karntaka',560010)";
		String query9 = "INSERT INTO location(id,name,city,state,pincode) VALUES(10,'vinay nagar','Banglore','karntaka',560010)";

		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("Connection is succesful");
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			stmt.execute(query1);
			stmt.execute(query2);
			stmt.execute(query3);
			stmt.execute(query4);
			stmt.execute(query5);
			stmt.execute(query6);
			stmt.execute(query7);
			stmt.execute(query8);
			stmt.execute(query9);
			System.out.println("data inserted into table");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
