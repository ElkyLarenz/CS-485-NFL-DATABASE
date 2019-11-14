package scrape;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class refresh {
	public static void main(String[] args)
	{
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			//Update Sport java object
			
			//Save java object Sport to database
			session.createSQLQuery("TRUNCATE TABLE  defensivelineman").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  defensiveback").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  linebacker").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  qb").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  runningback").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  teams").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  tightend").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  widereceiver").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  fieldgoalkicker").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  kickoffkicker").executeUpdate();
			session.createSQLQuery("TRUNCATE TABLE  kickreturner").executeUpdate();
			tx.commit();
		}catch(Exception se) {
			tx.rollback();
		}finally {
			if(session.isOpen()) session.close();
		}
			sessionFactory.close();
		phaseOne();	
		
		
		

		
		
		
		
		
	}	
	
	public static void phaseOne()
	{
	
		System.out.println("\nTeam");
		teamScrape team = new teamScrape();
		System.out.println("\nQB");
		qbScrape qb = new qbScrape();
		System.out.println("\nRunningback");
		runningBackScrape run = new runningBackScrape();
		System.out.println("Wide Reciever \n");
		wideReceiverScrape wide = new wideReceiverScrape();
		System.out.println("\nTight End");
		tightEndScrape tight = new tightEndScrape();
		System.out.println("\nDefensive Lineman");
		defensiveLinemanScrape line = new defensiveLinemanScrape();
		System.out.println("\nLinebacker");
		linebackerScrape line2 = new linebackerScrape();
		System.out.println("\nDefensive Back");
		defensiveBackScrape def = new defensiveBackScrape();
		System.out.println("\nField Goal Kicker");
		fieldGoalKickerScrape kick = new fieldGoalKickerScrape();
		System.out.println("\nKickoff Kicker");
		kickoffKickerScrape kickoff = new kickoffKickerScrape();
		System.out.println("\nKick Returner");
		kickReturnerScrape kickreturner = new kickReturnerScrape();
		
	}
	
	
	
}
