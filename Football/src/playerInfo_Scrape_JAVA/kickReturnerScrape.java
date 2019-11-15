package playerInfo_Scrape_JAVA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class kickReturnerScrape {

	public kickReturnerScrape()
	{
	final String url = "http://www.nfl.com/stats/categorystats?archive=false&conference=null&statisticPositionCategory=KICK_RETURNER&season=2019&seasonType=REG&experience=&tabSeq=1&qualified=true&Submit=Go";

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
				final String playerRet = row.select("td:nth-of-type(5)").text();
				final String playerYards = row.select("td:nth-of-type(6)").text();
				final String playerAverage = row.select("td:nth-of-type(7)").text();
				final String playerLng = row.select("td:nth-of-type(8)").text();
				final String playerTd = row.select("td:nth-of-type(9)").text();
				final String playerTwenty = row.select("td:nth-of-type(10)").text();
				final String playerForty = row.select("td:nth-of-type(11)").text();
				final String playerFc = row.select("td:nth-of-type(12)").text();
				final String playerFum = row.select("td:nth-of-type(13)").text();
				final String playerPuntRet = row.select("td:nth-of-type(14)").text();
				final String playerPuntRety = row.select("td:nth-of-type(15)").text();
				final String playerPuntAvg = row.select("td:nth-of-type(16)").text();
				final String playerPuntLng = row.select("td:nth-of-type(17)").text();
				final String playerPuntTd = row.select("td:nth-of-type(18)").text();
				final String playerPuntTwenty = row.select("td:nth-of-type(19)").text();
				final String playerPuntForty = row.select("td:nth-of-type(20)").text();
				final String playerPuntFc = row.select("td:nth-of-type(21)").text();
				final String playerPuntFum = row.select("td:nth-of-type(22)").text();
				
				send(playerRank, playerName, playerTeam, playerPos, playerRet, playerYards, 
						playerAverage, playerLng, playerTd, playerTwenty, playerForty, playerFc, playerFum,
						playerPuntRet, playerPuntRety, playerPuntAvg, playerPuntLng, playerPuntTd, playerPuntTwenty, playerPuntForty, playerPuntFc, playerPuntFum);
				System.out.println(playerRank + "\t" + playerName + "\t \t" + playerTeam + "\t" + playerPos + "\t"
						+ playerRet);
			}
		}
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	}
	
	public void send(String ra, String na, String te, String po, String ko, String ya, String oo, String av, String tb, String pc, String re,
			String av2, String td, String osk, String oskr, String word16, String word17, String word18, String word19, String word20, String word21
			, String word22) {
		kickReturner kick1 = new kickReturner( ra,  na,  te, po, ko, ya, oo, av, tb, pc,  re,
				 av2, td, osk, oskr, word16, word17, word18, word19, word20, word21, word22);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			// Update Sport java object

			// Save java object Sport to database
			session.save(kick1);
			session.flush();
			tx.commit();
		} catch (Exception se) {
			tx.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}
		sessionFactory.close();
	}
}
