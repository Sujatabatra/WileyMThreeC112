package com.sujata.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//1.2 Connect
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc112", "root", "sujata");
		
		return connection;
	}
}
