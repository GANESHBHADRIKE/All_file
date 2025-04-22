package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommand {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306:/mydb","root","root");
		Statement stmt = con.createStatement();
		String str = "insert into members values(4,'bhadrike','sujata',32,1993)";
		stmt.execute(str);
		con.close();
		System.out.println("query executed...");
	}

}
