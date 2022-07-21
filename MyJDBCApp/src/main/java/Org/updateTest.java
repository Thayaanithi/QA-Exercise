package Org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String userName = "root";
		String password = "Raja1234@";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
			
			//read, update, delete operations occur here in the try block
			//below is how to update a record
			
					
			String query = "update student set address='Burlin' where id=107";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record updated");
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
