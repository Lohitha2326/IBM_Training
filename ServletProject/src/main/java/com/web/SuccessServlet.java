package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/views/success")
public class SuccessServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html");
				//To print the statements 
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		
		//If we want to print in jsp file
		//String user=(String)session.getAttribute("userSession");
		//out.println("welcome "+user);
		RequestDispatcher rd=req.getRequestDispatcher("Success.jsp");
		rd.forward(req, resp);
		

	}
}
