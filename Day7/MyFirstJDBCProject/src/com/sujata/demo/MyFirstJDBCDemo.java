package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJDBCDemo {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement statement;
		try {
			//1.Connect
			//1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//1.2 Connect
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cititraining", "root", "sujata");
		
			//2. Query
			statement=connection.prepareStatement("select * from share");
			ResultSet resultset=statement.executeQuery();
			
			//3. Process Result
			while(resultset.next()) {
				int id=resultset.getInt("instrumentId");
				String name=resultset.getString("instrumentName");
				int mr=resultset.getInt("marketRate");
				System.out.println(id+"  "+name+"  "+mr);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				//4. Close
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
