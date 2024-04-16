package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/views/login")
public class LoginServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		String username=req.getParameter("uname");
		String password=req.getParameter("pass");
		
		//servlet config
		ServletConfig sc1=getServletConfig();
		String scurl=sc1.getInitParameter("url");
		
		
		//servlet context and also in web.xml
		ServletContext sc=req.getServletContext();
		String uname=sc.getInitParameter("user");
		String scpass=sc.getInitParameter("pass");
		
		
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user=uname;
		String pass=scpass;
		//Loading the driver class
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		//Create the connection
		Connection con=DriverManager.getConnection(url,user,pass);
		
		
		//using preparedStatement
		PreparedStatement pst=con.prepareStatement("insert into login values(?,?)");
		
		pst.setString(1,username);
		pst.setString(2,password);
		
		pst.executeUpdate();
		con.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//http session accessing the output in another servlet so we created SuccessServlet.java9667
		HttpSession session=req.getSession();
		session.setAttribute("userSession", username);
		
		RequestDispatcher rd=req.getRequestDispatcher("success");
		rd.forward(req,resp);
		
		
		//resp.setContentType("text/html");
		//To print the statements 
		//PrintWriter out=resp.getWriter();
		//out.println("username is:"+username+","+"Password is:"+password);

	}
	
	

}
