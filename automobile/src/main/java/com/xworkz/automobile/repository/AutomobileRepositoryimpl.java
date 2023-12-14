package com.xworkz.automobile.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.model.Vehicle;

public class AutomobileRepositoryimpl implements AutomobileRepository {
	public AutomobileRepositoryimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveVehicleDetails(Vehicle vehicle) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Rohanme1@";
		String insertQuery = "INSERT INTO vehicle(id,name,color,type,model) VALUES(?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setInt(1, vehicle.getId());
			pstmt.setString(2, vehicle.getName());
			pstmt.setString(3, vehicle.getColor());
			pstmt.setString(4, vehicle.getType());
			pstmt.setInt(5, vehicle.getModel());
			pstmt.execute();
			System.out.println("created succesfully");
			System.out.println(vehicle.getModel());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void saveVehicleDetails(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Rohanme1@";
		/*
		 * String insertQuery =
		 * "INSERT INTO vehicle(id,name,color,type,model) VALUES(?,?,?,?,?)";
		 */
		
		String updateQuery="update vehicle set color=? ,model=?,where name=?";
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			for (Vehicle vehicles : vehicle) {
				pstmt.setInt(1, vehicles.getId());
				pstmt.setString(2, vehicles.getName());
				pstmt.setString(3, vehicles.getColor());
				pstmt.setString(4, vehicles.getType());
				pstmt.setInt(5, vehicles.getModel());
				pstmt.execute();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

}

	@Override
	public void updateVehicleDetailsByName(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehicle> fetchAllVehicles() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Rohanme1@";
		String fetchVehicles="select* from vehicle";
		
		List<Vehicle> vehicles=new ArrayList<Vehicle>();
		
		try {
			Connection conn=DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement pstmt=conn.prepareStatement(fetchVehicles);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				/*
				 * System.out.println(rs.getString("name"));
				 * System.out.println(rs.getString("color"));
				 * System.out.println(rs.getString(4)); 
				 * System.out.println(rs.getString(5));
				 */
				/* vehicle */
				Vehicle vehicle=new Vehicle();
				vehicle.setName(rs.getString("name"));
				vehicle.setColor(rs.getString("color"));
				vehicle.setType(rs.getString(4));
				vehicle.setModel(rs.getInt(5));
				vehicles.add(vehicle);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicles;
	}}

/* ThinkPadT440S */
