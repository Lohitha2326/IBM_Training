package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//Instead of creating web.xml we can use the annotation
@WebServlet("/MyFirst")
public class FirstServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html");
		
		//To print the statements 
		//PrintWriter out=resp.getWriter();
		//out.println("<h1>Hello World</h1>");
		
		//to get html file we use request dispatcher instead of writing every code in out.print()
		RequestDispatcher rd=req.getRequestDispatcher("views/Home.html");
		rd.forward(req,resp);
		
	}	

}
