package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.IUser;
import service.IUserImpl;

@WebServlet("/reset")
public class ResetPasswordServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		IUser iuser=(IUser) IUserImpl.getInstance();
		HttpSession session=req.getSession();
		String username=(String) session.getAttribute("username");
		System.out.println(username);
		iuser.reset(username, password, confirmPassword);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		doGet(req, resp);
	}
	
}
