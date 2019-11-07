package scrape;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class linebackerScrape {
	public linebackerScrape()
	{
	final String url = "http://www.nfl.com/stats/categorystats?archive=false&conference=null&statisticPositionCategory=LINEBACKER&season=2019&seasonType=REG&experience=&tabSeq=1&qualified=true&Submit=Go";

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
				final String playerComb = row.select("td:nth-of-type(5)").text();
				final String playerTotal = row.select("td:nth-of-type(6)").text();
				final String playerAst = row.select("td:nth-of-type(7)").text();
				final String playerSck = row.select("td:nth-of-type(8)").text();
				final String playerSfty = row.select("td:nth-of-type(9)").text();
				final String playerPdef = row.select("td:nth-of-type(10)").text();
				final String playerInt = row.select("td:nth-of-type(11)").text();
				final String playerTds = row.select("td:nth-of-type(12)").text();
				final String playerYds = row.select("td:nth-of-type(13)").text();
				final String playerLng = row.select("td:nth-of-type(14)").text();
				final String playerFf = row.select("td:nth-of-type(15)").text();
				final String playerRec = row.select("td:nth-of-type(16)").text();
				final String playerTd = row.select("td:nth-of-type(17)").text();
				send(playerRank, playerName, playerTeam, playerPos, playerComb, playerTotal, playerAst, playerSck,  playerSfty, 
						playerPdef,playerInt, playerTds,  playerYds, playerLng, playerFf, playerRec, playerTd);
				
				System.out.println(
						playerRank + " " + playerName + " " + playerTeam + " " + playerPos + " " + playerRec);
			}
		}
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	
	}
	public static void send(String ra, String na, String te, String pos1, String comb1, String tot, String ast, String sck, String sfty,
			String pdef, String inter, String tds, String yds, String lng, String ff, String rec, String td)
	{

		linebacker line1 = new linebacker(ra, na, te, pos1, comb1, tot, ast, sck, sfty, pdef, inter, tds, yds, lng, ff, rec, td);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			//Update Sport java object
			
			//Save java object Sport to database
			session.save(line1);
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
