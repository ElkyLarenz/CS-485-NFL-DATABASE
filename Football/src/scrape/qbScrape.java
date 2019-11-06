package scrape;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class qbScrape {
	public static void main(String[] args)
	{
		final String url = "http://www.nfl.com/stats/categorystats?tabSeq=1&statisticPositionCategory=QUARTERBACK&qualified=true&season=2019&seasonType=REG";
		
		try
		{
			final Document doc = Jsoup.connect(url).get();
			for (Element row : doc.select("table.data-table1  tr"))
			{
				
				if (row.select("td:nth-of-type(2)").text().equals("")) {
					continue;
				}
				else
				{
					final String playerRank = row.select("td:nth-of-type(1)").text();
					final String playerName = row.select("td:nth-of-type(2)").text();
					final String playerTeam = row.select("td:nth-of-type(3)").text();
					final String playerPos = row.select("td:nth-of-type(4)").text();
					final String playerCom = row.select("td:nth-of-type(5)").text();
					final String playerAtt = row.select("td:nth-of-type(6)").text();
					final String playerPct = row.select("td:nth-of-type(7)").text();
					final String playerAttG = row.select("td:nth-of-type(8)").text();
					final String playerYds = row.select("td:nth-of-type(9)").text();
					final String playerAvg = row.select("td:nth-of-type(10)").text();
					final String playerYdsG = row.select("td:nth-of-type(11)").text();
					final String playerTd = row.select("td:nth-of-type(12)").text();
					final String playerInt = row.select("td:nth-of-type(13)").text();
					final String player1st = row.select("td:nth-of-type(14)").text();
					final String player1stPerc = row.select("td:nth-of-type(15)").text();
					final String playerLng = row.select("td:nth-of-type(16)").text();
					final String player20Plus = row.select("td:nth-of-type(17)").text();
					final String player40Plus = row.select("td:nth-of-type(18)").text();
					final String playerSck = row.select("td:nth-of-type(19)").text();
					final String playerRate = row.select("td:nth-of-type(20)").text();
					send(playerRank, playerName, playerTeam, playerPos, playerCom, playerAtt, playerPct, playerAttG, playerYds, playerAvg, playerYdsG,
							playerTd, playerInt, player1st, player1stPerc, playerLng, player20Plus, player40Plus, playerSck, playerRate);
					System.out.println(playerRank + " " + playerName + " " + playerTeam + " " + playerPos + " " + playerCom);
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void send(String ra, String na, String te, String pos, String com, String att, String pct, String attG, String yds, String avg,
			String ydsG, String td, String inter, String first, String firstPer, String lng, String twen, String forty, String sck, String rate)
	{
		qb qb1 = new qb(ra, na, te, pos, com, att, pct, attG, yds, avg, ydsG, td, inter, first, firstPer, lng, twen, forty, sck, rate);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			System.out.print("hi");
			//Update Sport java object
			
			//Save java object Sport to database
			session.save(qb1);
			session.flush();
			tx.commit();
		}catch(Exception se) {
			tx.rollback();
		}finally {
			if(session.isOpen()) session.close();
		}
	}

}
