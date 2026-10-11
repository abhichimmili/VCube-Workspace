package com.petcare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static final String URL = "jdbc:mysql://localhost:3306/petcare_db";
	public static final String USER = "root";
	public static final String PASSWORD = "Admin@1289";

//	Modern JDBC drivers are normally loaded automatically when the driver JAR is on the classpath,
//	so Class.forName() is not required here.
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
