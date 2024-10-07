package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("driver class loaded");
		
		//get the connection 
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmbank", "root", "root");
		
		System.out.println("i got the connection");
		
		Statement statement = connection.createStatement();
		
		int x = statement.executeUpdate("INSERT INTO accounts (account_id, customer_id, account_type, balance) VALUES (100, 1, 'savings', 20000.00)");
		
		int y = statement.
		
		System.out.println(x + "row(s) inserted");
		
		//close the connection 
		connection.close();
		
	}

}