package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {
	public static void main(String[] args) {
		System.out.println("Invoking main in excution mthod");

		String jdbcUrl = "jdbc:mysql://localhost:3306/JDBC";
		String userName = "root";
		String password = "Rohanme1@";

		String updateQuery = "UPDATE location set city='Manglore',state='Karnataka' where name ='rajaji nagar'";
		String updateQuery1 = "UPDATE location set city='Honavar',state='Karnataka' where name ='vinay nagar'";
		String updateQuery2 = "UPDATE location set city='kollur',state='Karnataka' where name ='vijaynagar'";
		String updateQuery3 = "UPDATE location set city='mallur',state='Karnataka' where name ='shivaji nagarr'";
		String updateQuery4 = "UPDATE location set city='sagara',state='Karnataka' where name ='majestic'";
		String updateQuery5 = "UPDATE location set city='vallore',state='Karnataka' where name ='kr market'";
		String updateQuery6 = "UPDATE location set city='hubli',state='Karnataka' where name ='hassur'";
		String updateQuery7 = "UPDATE location set city='karskod',state='Karnataka' where name ='vinay nagar'";
		String updateQuery8 = "UPDATE location set city='karkala',state='Karnataka' where name ='vinay nagar'";
		String updateQuery9 = "UPDATE location set city='mysore',state='Karnataka' where name ='vinay nagar'";

		String deleteQuery = "DELETE From location where name='hassur'";

		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(updateQuery);
			stmt.executeUpdate(updateQuery1);
			stmt.executeUpdate(updateQuery2);
			stmt.executeUpdate(updateQuery3);
			stmt.executeUpdate(updateQuery4);
			stmt.executeUpdate(updateQuery5);
			stmt.executeUpdate(updateQuery6);
			stmt.executeUpdate(updateQuery7);
			stmt.executeUpdate(updateQuery8);
			stmt.executeUpdate(updateQuery9);
			System.out.println("update succesfully");

			stmt.execute(deleteQuery);
			System.out.println("DElete succesfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
