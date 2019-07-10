package service;


import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateUtil;
import model.User;

public class IUserImpl implements IUser
{
	public static IUserImpl userimpl=null;
	private Session session=HibernateUtil.getSession();
	
	
	@Override
	public boolean register(User user) 
	{
		Transaction transaction=session.beginTransaction();
		if(user.getPassword().equals(user.getConfirmPassword()))
		{
			session.save(user);
			transaction.commit();
			session.close();
			return true;	
		}
		return false;
	}
	
	@Override
	public boolean login(String username, String password) 
	{
		User user=session.get(User.class, username);
		if(password.equals(user.getPassword()))
		{
			return true;
		}
		return false;
	}

	@Override
	public void reset(String username, String password, String confirmPassword) 
	{
		Transaction transaction=session.beginTransaction();
		User user=session.get(User.class, username);
		user.setUsername(username);
		user.setPassword(password);
		user.setConfirmPassword(confirmPassword);
		session.update(user);
		transaction.commit();
		session.close();
		System.out.println("Password Changed Seccsessfully...");
	}
	
	public static IUserImpl getInstance()
	{
		if(userimpl==null)
		{
			userimpl=new IUserImpl();
		}
		return userimpl;
	}
	
}