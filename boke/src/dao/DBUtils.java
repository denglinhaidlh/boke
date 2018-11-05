package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static String driver="com.mysql.jdbc.Driver";
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/boke?useUnicode=true&characterEncoding=UTF-8&useSSL=true";
	private static String username = "root";
	private static String password = "123456";
    
    static{
		try {	
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    
    public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
		return connection;		
	}
	public static void closeAll(Connection connection,Statement statement,ResultSet resultSet){
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    
}
