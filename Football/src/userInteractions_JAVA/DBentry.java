package userInteractions_JAVA;

import javax.servlet.http.HttpServlet;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBentry extends HttpServlet{
	 userLoginInfo user = new userLoginInfo();
	 Configuration configuration = new Configuration().configure();
	 
     SessionFactory sessionFactory = configuration.buildSessionFactory();

     Session session = sessionFactory.openSession();

     Transaction transaction = session.beginTransaction();
	 @SuppressWarnings("rawtypes")
	public boolean userlookup(String cardN, String passW) {
	        try {
	            
	            
	            
	          
	          
	            user.setcardN(cardN);
 	            user.setpassW(passW);
 	            
 	           Iterator  results = session.createQuery("from userLoginInfo where userName='"+userLoginInfo.getcardN()+"' and Password='"+user.getpassW()+"'").iterate();
	            if (results.hasNext())
	            {
		    		return true;
	            }
	            else
	            	{
	            	session.save(user); //Save java object 
	            	session.flush();
		    		transaction.commit();
		    		transaction.wasCommitted();
	            	return false;
	            	
	            	}
	            
		}catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
			return true;
	
	 }
	 
	 
	 public boolean userReg(String FN, String LN) {
	        try {
	            
	 
	           
	        
	           sessionFactory.getCurrentSession();
	           transaction.wasCommitted();
	           Transaction transaction2 = session.beginTransaction();
	            
	            user.setFN(FN);
	            user.setLN(LN);
	            Query q = sessionFactory.getCurrentSession().createQuery("update userLoginInfo set FN="
	            +userLoginInfo.getFN()+" and LN="+userLoginInfo.getLN() + " where userName=" 
	            		+userLoginInfo.getcardN() + " and Password=" + user.getpassW());
	           
	            
	            q.executeUpdate();
	            session.save(user);
	            session.flush();
	            transaction2.commit();
	            session.close();
	            System.out.println("\n\n Details Added \n");
		}catch (HibernateException e) {
         System.out.println(e.getMessage());
         System.out.println("error");
     }
			return true;
	
	 }
}