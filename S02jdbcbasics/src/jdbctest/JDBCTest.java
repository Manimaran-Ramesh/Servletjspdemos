package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "3a5cde");
				Statement statement = connection.createStatement();
				ResultSet resultset=statement.executeQuery("select*from account");
				while(resultset.next()){
					System.out.println(resultset.getInt(1)+","+resultset.getString(2)+","+resultset.getString(3)+","+resultset.getLong(4));
				}
					statement.close();
					connection.close();
				}
}
	
				                        


