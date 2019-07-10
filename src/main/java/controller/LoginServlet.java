package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IUser;
import service.IUserImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
		ServletException, IOException 
	{
		PrintWriter pw=resp.getWriter();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		IUser iuser=(IUser) new IUserImpl();
		boolean result=iuser.login(username,password);
		if(result)
		{
			pw.print("<html>");
			pw.print("<font color='blue'>Welcome To Bridgelabz...</font>");
		}
		else
		{
			pw.print("<font color='orange'>Please Enter The Valid Username And Valid Password");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
		ServletException, IOException 
	{
		doGet(req, resp);
	}
	
}