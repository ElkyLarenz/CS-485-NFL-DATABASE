package scrape;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class kickoffKickerScrape {
	public kickoffKickerScrape()
	{

		final String url = "http://www.nfl.com/stats/categorystats?archive=false&conference=null&statisticPositionCategory=KICKOFF_KICKER&season=2019&seasonType=REG&experience=&tabSeq=1&qualified=true&Submit=Go";

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
					final String playerKo = row.select("td:nth-of-type(5)").text();
					final String playerYards = row.select("td:nth-of-type(6)").text();
					final String playerOob = row.select("td:nth-of-type(7)").text();
					final String playerAverage = row.select("td:nth-of-type(8)").text();
					final String playerTb = row.select("td:nth-of-type(9)").text();
					final String playerPct = row.select("td:nth-of-type(10)").text();
					final String playerRet = row.select("td:nth-of-type(11)").text();
					final String playerAvg2 = row.select("td:nth-of-type(12)").text();
					final String playerTd = row.select("td:nth-of-type(13)").text();
					final String playerOsk = row.select("td:nth-of-type(14)").text();
					final String playerOskr = row.select("td:nth-of-type(15)").text();
					
					send(playerRank, playerName, playerTeam, playerPos, playerKo, playerYards, playerOob,
							playerAverage, playerTb, playerPct, playerRet, playerAvg2, playerTd, playerOsk,
							playerOskr);
					System.out.println(playerRank + "\t" + playerName + "\t \t" + playerTeam + "\t" + playerPos + "\t"
							+ playerKo);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void send(String ra, String na, String te, String po, String ko, String ya, String oo, String av, String tb, String pc, String re,
			String av2, String td, String osk, String oskr) {
		kickoffKicker kick1 = new kickoffKicker( ra,  na,  te, po, ko, ya, oo, av, tb, pc,  re,
				 av2, td, osk, oskr);
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
