package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="2326@Repala";
		//Loading the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//Create the connection
		Connection con=DriverManager.getConnection(url,user,password);
		//create the statement
		Statement st=con.createStatement();
		//Query information
		//creating table
		/*String sql="create table jdbc(id integer,name varchar(20))";
		int result = st.executeUpdate(sql);
		if(result == 0)
		{
			System.out.println("Table created successfully");
		}
		*/
		//To insert values
		/*
		String insert="insert into jdbc values(101,'abcd')";
		int row=st.executeUpdate(insert);
		System.out.println(row+"Records inserted");
		*/
		
		//Values from jdbc using resultset
		
		/*ResultSet rs=st.executeQuery("select * from jdbc");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+","+rs.getString(2));
		}
		*/
		
		//con.commit();
		con.close();
		System.out.println("connection closed");
		
		
		
	}

}
