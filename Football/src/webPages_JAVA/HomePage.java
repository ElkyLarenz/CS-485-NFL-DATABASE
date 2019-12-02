package webPages_JAVA;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.*;
import userInteractions_JAVA.userLoginInfo;

public class HomePage extends HttpServlet{
	public static void main(String args[]) {
	 userLoginInfo user = new userLoginInfo();
	 defensiveBack dback = new defensiveBack();
	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
    
			String sql_defensiveback = "from defensiveback";//user table name which is in database.
					Query query = session.createQuery(sql_defensiveback);
					//for fetch we need iterator
					Iterator it=query.iterate();
					while(it.hasNext())
					    {
					         dback = (defensiveBack) it.next();
					System.out.println("Id :"+dback.getId()+"FirstName"+dback.getName());

					    }
	tx.commit();
		}catch(Exception se) {
			tx.rollback();
		}finally {
			if(session.isOpen()) session.close();
		}
			sessionFactory.close();
	}
	
	public boolean retrievePlayerData() {
		
		return false;
		
	}
}
