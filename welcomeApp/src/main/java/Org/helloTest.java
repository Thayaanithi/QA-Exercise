package Org;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class helloTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String userName = "root";
		String password = "Raja1234@";
		// Connection con=null;

		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}