package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.IUser;
import service.IUserImpl;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private IUser iuser=(IUser) IUserImpl.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
		ServletException, IOException 
	{
		PrintWriter pw=resp.getWriter();
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		String DOB=req.getParameter("DOB");
		String mobile=req.getParameter("mobile");
		String mail=req.getParameter("mail");

		User user=new User(firstName,lastName,userName,password,confirmPassword,DOB,mobile,mail);
		
		user.setFirstname(firstName);
		user.setLastName(lastName);
		user.setUsername(userName);
		user.setPassword(password);
		user.setConfirmPassword(confirmPassword);
		user.setDOB(DOB);
		user.setMobile(mobile);
		user.setMail(mail);
		
		boolean result=iuser.register(user);
		pw.print("<html>");
		if(result)
		{
			pw.print("<font color='blue'>User Registration Seccusfully...</font>");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
		else
		{
			pw.print("<font color='orange'>Please Correctly Insert All Fileds...</font></html>");
			req.getRequestDispatcher("registraion.jsp").include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		doGet(req, resp);
	}	
	
}