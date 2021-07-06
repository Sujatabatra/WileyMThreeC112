package com.sujata.model.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	public static Connection makeConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc112","root","sujata");
		return connection;
	}
}