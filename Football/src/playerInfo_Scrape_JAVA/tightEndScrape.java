package playerInfo_Scrape_JAVA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class tightEndScrape {
	public tightEndScrape()
	{
	final String url = "http://www.nfl.com/stats/categorystats?archive=false&conference=null&statisticPositionCategory=TIGHT_END&season=2019&seasonType=REG&experience=&tabSeq=1&qualified=true&Submit=Go";

	try {
		final Document doc = Jsoup.connect(url).get();
		for (Element row : doc.select("table.data-table1  tr")) {

			if (row.select("td:nth-of-type(2)").text().equals("")) {
				continue;
			} else {
				final String playerRank = row.select("td:nth-of-type(1)").text();
				final String playerName = row.select("td:nth-of-type(2)").text();
				final String playerTeam = row.select("td:nth-of-type(3)").text();
				final String playerPos = row.select("td:nth-of-type(4)").text();
				final String playerRec = row.select("td:nth-of-type(5)").text();
				final String playerYds = row.select("td:nth-of-type(6)").text();
				final String playerAvg = row.select("td:nth-of-type(7)").text();
				final String playerYdsG = row.select("td:nth-of-type(8)").text();
				final String playerLng = row.select("td:nth-of-type(9)").text();
				final String playerTd = row.select("td:nth-of-type(10)").text();
				final String player20Plus = row.select("td:nth-of-type(11)").text();
				final String player40Plus = row.select("td:nth-of-type(12)").text();
				final String player1st = row.select("td:nth-of-type(13)").text();
				final String player1stPerc = row.select("td:nth-of-type(14)").text();
				final String playerFum = row.select("td:nth-of-type(15)").text();
				send(playerRank, playerName, playerTeam, playerPos, playerRec, playerYds, playerAvg, playerYdsG,  playerLng, 
						playerTd,player20Plus, player40Plus,  player1st, player1stPerc,    playerFum);
				
				System.out.println(
						playerRank + " " + playerName + " " + playerTeam + " " + playerPos + " " + playerRec);
			}
		}
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	}
	
	public static void send(String ra, String na, String te, String pos, String rec, String yds, String avg,
			String ydsG, String td, String lng, String first, String firstPer,  String twen, String forty, String fum)
	{
		tightEnd tight1 = new tightEnd(ra, na, te, pos, rec, yds, avg, ydsG, td, lng, first, firstPer, twen, forty, fum);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			
			//Update Sport java object
			
			//Save java object Sport to database
			session.save(tight1);
			session.flush();
			tx.commit();
		}catch(Exception se) {
			tx.rollback();
		}finally {
			if(session.isOpen()) session.close();
		}
		sessionFactory.close();
	}
}
