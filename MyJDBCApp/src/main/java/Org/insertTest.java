package Org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class insertTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String userName = "root";
		String password = "Raja1234@";
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
			String query="insert into student value (112, 'Richard', 'Rome', 85799565)";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record inserted");
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally 
		{
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}
}	
