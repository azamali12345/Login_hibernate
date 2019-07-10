package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	static Session session=null;
	
	public static Session getSession()
	{
		SessionFactory sessioFactory;
		Configuration configuration=new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		sessioFactory=configuration.buildSessionFactory();
		session=sessioFactory.openSession();
		return session;
	}
}
