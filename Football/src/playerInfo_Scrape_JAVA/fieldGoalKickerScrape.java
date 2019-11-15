package playerInfo_Scrape_JAVA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class fieldGoalKickerScrape {

	public fieldGoalKickerScrape() {
		final String url = "http://www.nfl.com/stats/categorystats?archive=false&conference=null&statisticPositionCategory=FIELD_GOAL_KICKER&season=2019&seasonType=REG&experience=&tabSeq=1&qualified=true&Submit=Go";

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
					final String playerFgm = row.select("td:nth-of-type(5)").text();
					final String playerFgatt = row.select("td:nth-of-type(6)").text();
					final String playerPct19 = row.select("td:nth-of-type(7)").text();
					final String playerBlk19 = row.select("td:nth-of-type(8)").text();
					final String playerLng19 = row.select("td:nth-of-type(9)").text();
					final String playerAm29 = row.select("td:nth-of-type(10)").text();
					final String playerPct29 = row.select("td:nth-of-type(11)").text();
					final String playerAm39 = row.select("td:nth-of-type(12)").text();
					final String playerPct39 = row.select("td:nth-of-type(13)").text();
					final String playerAm49 = row.select("td:nth-of-type(14)").text();
					final String playerPct49 = row.select("td:nth-of-type(15)").text();
					final String playerAm50plus = row.select("td:nth-of-type(16)").text();
					final String playerPct50plus = row.select("td:nth-of-type(17)").text();
					final String playerXpm = row.select("td:nth-of-type(18)").text();
					final String playerXpatt = row.select("td:nth-of-type(19)").text();
					final String playerPctpat = row.select("td:nth-of-type(20)").text();
					final String playerBlkpat = row.select("td:nth-of-type(21)").text();
										send(playerRank, playerName, playerTeam, playerPos, playerFgm, playerFgatt, playerPct19,
							playerBlk19, playerLng19, playerAm29, playerPct29, playerAm39, playerPct39, playerAm49,
							playerPct49, playerAm50plus, playerPct50plus, playerXpm, playerXpatt, playerPctpat,
							playerBlkpat);

					System.out.println(playerRank + "\t" + playerName + "\t \t" + playerTeam + "\t" + playerPos + "\t"
							+ playerFgm + "\t" + playerAm50plus + "\t" + playerPct50plus);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void send(String Rank, String playerName, String playerTeam, String playerPos, String playerFgm,
			String playerFgatt, String playerPct19, String playerBlk19, String playerLng19, String playerAm29,
			String playerPct29, String playerAm39, String playerPct39, String playerAm49, String playerPct49,
			String playerAm50plus, String playerPct50plus, String playerXpm, String playerXpatt, String playerPctpat,
			String playerBlkpat) {
		fieldGoalKicker kick1 = new fieldGoalKicker(Rank, playerName, playerTeam, playerPos, playerFgm,
				playerFgatt, playerPct19, playerBlk19, playerLng19, playerAm29, playerPct29, playerAm39, playerPct39,
				playerAm49, playerPct49, playerAm50plus, playerPct50plus, playerXpm, playerXpatt, playerPctpat,
				playerBlkpat);
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
