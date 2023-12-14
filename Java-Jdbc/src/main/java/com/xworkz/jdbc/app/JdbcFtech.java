package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFtech {
public static void main(String[] args) {
	System.out.println("invoking in  jdbc");
	String jdbcUrl = "jdbc:mysql://localhost:3306/JDBC";
	String userName = "root";
	String password = "Rohanme1@";
	
	
	String query="SELECT * FROM location where name='vijaynagar'";
	try {
		Connection conn=DriverManager.getConnection(jdbcUrl,userName,password);
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		if(rs.next()) {
			System.out.println("Result present in ResultSet");
			System.out.println("Location name" +rs.getString("name"));
			System.out.println("City name" +rs.getString("city"));
			System.out.println("Pincode->" +rs.getInt("pincode"));
			
		}
		
		System.out.println("Fetched Records");
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}


