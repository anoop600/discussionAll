package com.mindtree.javaEighr;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class DataTimeDemo {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date d = new Date(5, 50, 50);
		LocalDate ld = d.toLocalDate();
		Connection c = null;
		String url = "jdbc:mysql://localhost:3306/localdemo";
		String user = "root";
		String password = "Welcome123";
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Anoop");
		employee.setDob(ld);
		try {
			c = DriverManager.getConnection(url, user, password);
			String query = "insert into demo values(1,'Anoop',ld)";
			PreparedStatement ps = c.prepareStatement(query);
			ps.executeQuery();
		} catch (SQLException e) {

		}

	}

}
