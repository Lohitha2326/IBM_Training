package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Example2 {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="2326@Repala";
		//Loading the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//Create the connection
		Connection con=DriverManager.getConnection(url,user,password);
		
		
		//using preparedStatement
		PreparedStatement pst=con.prepareStatement("insert into jdbc values(?,?)");
		
		pst.setInt(1,103);
		pst.setString(2, "bcd");
		pst.addBatch();
		
		
		pst.setInt(1,104);
		pst.setString(2, "cde");
		pst.addBatch();
		
		pst.setInt(1,105);
		pst.setString(2, "efg");
		pst.addBatch();
		
		
		int[] row=pst.executeBatch();
		System.out.println(row+"Inserted");
		con.close();
		
	}

}
