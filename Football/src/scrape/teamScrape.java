package scrape;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class teamScrape {
	public teamScrape() {
		final String url = "https://www.foxsports.com/nfl/standings?season=2019&seasonType=1&grouping=3";

		try {
			final Document doc = Jsoup.connect(url).get();
			// System.out.println(doc.outerHtml());
			for (Element row : doc.select("table.wisbb_standardTable tr")) {
				if (row.select("td.wisbb_priorityColumn:nth-of-type(2)").text().equals("")) {
					continue;
				} else {
					// System.out.print("hi");
					final String teamName = row.select(".wisbb_fixedColumn.wisbb_text").text();
					final String teamWins = row.select("td.wisbb_priorityColumn:nth-of-type(2)").text();
					final String teamLosses = row.select("td.wisbb_priorityColumn:nth-of-type(3)").text();
					final String teamTies = row.select("td.wisbb_priorityColumn:nth-of-type(4)").text();
					final String teamPCT = row.select("td.wisbb_priorityColumn:nth-of-type(5)").text();
					final String teamPF = row.select("td:nth-of-type(6)").text();
					final String teamPA = row.select("td:nth-of-type(7)").text();
					final String teamHome = row.select(" td:nth-of-type(8)").text();
					final String teamAway = row.select(" td:nth-of-type(9)").text();
					final String teamConf = row.select(" td:nth-of-type(10)").text();
					final String teamDiv = row.select(" td:nth-of-type(11)").text();
					final String teamStrk = row.select(" td:nth-of-type(12)").text();
					send(teamName, teamWins, teamLosses, teamTies, teamPCT, teamPF, teamPA, teamHome, teamAway, teamConf, teamDiv, teamStrk);
					System.out.println(teamName + "\t Wins:" + teamWins + "\t Losses:" + teamLosses + "\t Ties:" + teamTies + 
							"\t Strk:" + teamStrk + "\t PF:" + teamPF + "\t div:" + teamDiv);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void send(String na, String wi, String lo, String ti, String pc, String pf, String pa, String ho, String aw, String co,
			String di, String st)
	{
		team team1 = new team(na, wi, lo, ti, pc, pf, pa, ho, aw, co, di, st);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
		
			//Update Sport java object
			
			//Save java object Sport to database
			session.save(team1);
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
