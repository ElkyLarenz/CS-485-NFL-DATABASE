package scrape;

public class runningBack {
	private int Id;
	private String Rank;
	private String Name;
	private String Team;
	private String Pos;
	private String Att;
	private String AttG;
	private String Yds;
	private String Avg;
	private String YdsG;
	private String Td;
	private String First;
	private String FirstPerc;
	private String Lng;
	private String TwentyPlus;
	private String FortyPlus;
	private String Fum;
	public runningBack(String ra, String na, String te, String pos2, String att2, String attG2, String yds2,
			String avg2, String ydsG2, String td2, String lng2, String first2, String firstPer, String twen,
			String forty, String fum2) {
		
		// TODO Auto-generated constructor stub
		Name = na;
		Team = te;
		Rank = ra;
		Pos = pos2;
		Att = att2;
		AttG = attG2;
		Yds = yds2;
		Avg = avg2;
		YdsG = ydsG2;
		Td = td2;
		First = first2;
		FirstPerc = firstPer;
		Lng = lng2;
		TwentyPlus = twen;
		FortyPlus = forty;
		Fum = fum2;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRank() {
		return Rank;
	}
	public void setRank(String rank) {
		Rank = rank;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getPos() {
		return Pos;
	}
	public void setPos(String pos) {
		Pos = pos;
	}
	public String getAtt() {
		return Att;
	}
	public void setAtt(String att) {
		Att = att;
	}
	public String getAttG() {
		return AttG;
	}
	public void setAttG(String attG) {
		AttG = attG;
	}
	public String getYds() {
		return Yds;
	}
	public void setYds(String yds) {
		Yds = yds;
	}
	public String getAvg() {
		return Avg;
	}
	public void setAvg(String avg) {
		Avg = avg;
	}
	public String getYdsG() {
		return YdsG;
	}
	public void setYdsG(String ydsG) {
		YdsG = ydsG;
	}
	public String getTd() {
		return Td;
	}
	public void setTd(String td) {
		Td = td;
	}
	public String getFirst() {
		return First;
	}
	public void setFirst(String first) {
		First = first;
	}
	public String getFirstPerc() {
		return FirstPerc;
	}
	public void setFirstPerc(String firstPerc) {
		FirstPerc = firstPerc;
	}
	public String getLng() {
		return Lng;
	}
	public void setLng(String lng) {
		Lng = lng;
	}
	public String getTwentyPlus() {
		return TwentyPlus;
	}
	public void setTwentyPlus(String twentyPlus) {
		TwentyPlus = twentyPlus;
	}
	public String getFortyPlus() {
		return FortyPlus;
	}
	public void setFortyPlus(String fortyPlus) {
		FortyPlus = fortyPlus;
	}
	public String getFum() {
		return Fum;
	}
	public void setFum(String fum) {
		Fum = fum;
	}

}
