package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getConnection()
	{
		Connection conn = null;
		try
		{
			DriverManager.registerDriver(new org.h2.Driver());
			
			String jdbcUrl = "jdbc:h2:tcp://localhost/~/test";
			conn = DriverManager.getConnection(jdbcUrl, "sa", "");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
}
