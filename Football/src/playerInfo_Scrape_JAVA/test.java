package playerInfo_Scrape_JAVA;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		qb user1 = new qb();
		
	
		
		Iterator results = session.createQuery("select * from qb ").iterate();
		if(results.hasNext())
		{
			user1 = (qb) results.next();
			System.out.println(user1.getname() + " " + user1.getrank() + " " + user1.getteam());
		}
	}

}
