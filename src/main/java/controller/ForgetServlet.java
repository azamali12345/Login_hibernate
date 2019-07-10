package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateUtil;
import model.User;

@WebServlet("/forget")
public class ForgetServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		PrintWriter pw=resp.getWriter();
		String username=req.getParameter("username");
		String mobile=req.getParameter("mobile");
		
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		
		Session session1=HibernateUtil.getSession();
		Transaction transaction=session1.beginTransaction();
		User user=session1.get(User.class, username);
		
		if(user.getMobile().compareTo(mobile)==0)
		{
			resp.sendRedirect("resetpassword.jsp");
		}
		else
		{
			pw.print("<html>");
			pw.print("<font color='blue'>Please Valid Username And Valid "
					+ "Mobile Number...");
			req.getRequestDispatcher("forget.jsp").include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		doGet(req, resp);
	}
	
}