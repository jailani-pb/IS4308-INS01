package ch06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDatabase {

	public static void main(String[] args) throws Exception {
		//1. Loading drivers
		Class.forName("com.mysql.jdbc.Driver");
		//2. Establishing connections
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/adp","root","Mypassword123-");
		System.out.println("Connected");
		//3. Creating statements
		Statement statement = connection.createStatement();
//		String sql = "INSERT INTO Student VALUES (1, 'Jailani'"
//				+ ", 1, 'Male', 'SICT', 0)";
		String sql = "SELECT * FROM Student";
		//4. Executing statements
//		statement.executeUpdate(sql);
//		System.out.println("Data has been inserted");
		ResultSet resultSet = statement.executeQuery(sql);
		//5. Processing result set
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getInt(6));
		}
	}

}








