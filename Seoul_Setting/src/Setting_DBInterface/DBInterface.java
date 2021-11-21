package Setting_DBInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBInterface {
	public static Connection Con;
	public static Statement Stmt;
	
	public static void Init() throws Exception {
		Class.forName("com.mysql.jdbc.Connection");
		Con = DriverManager.getConnection("jdbc:mysql://localhost/?useSSL=false", "root", "abc123");
		Stmt = Con.createStatement();
		
		System.out.println("DB Connect");
	}
}
