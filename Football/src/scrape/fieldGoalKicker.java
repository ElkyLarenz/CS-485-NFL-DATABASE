package scrape;

public class fieldGoalKicker {
	
	private int Id;
	private String Rank;
	private String Name;
	private String Team;
	private String Position;
	private String Fgm;
	private String Fgatt;
	private String Pct19;
	private String Blk19;
	private String Lng19;
	private String Am29;
	private String Pct29;
	private String Am39;
	private String Pct39;
	private String Am49;
	private String Pct49;
	private String Am50plus;
	private String Pct50plus;
	private String Xpm;
	private String XPatt;
	private String Pctpat;
	private String Blkpat;
	public fieldGoalKicker(String playerRank, String playerName, String playerTeam, String playerPos, String playerFgm,
			String playerFgatt, String playerPct19, String playerBlk19, String playerLng19, String playerAm29,
			String playerPct29, String playerAm39, String playerPct39, String playerAm49, String playerPct49,
			String playerAm50plus, String playerPct50plus, String playerXpm, String playerXpatt, String playerPctpat,
			String playerBlkpat) {
		// TODO Auto-generated constructor stub
		Rank = playerRank;
		Name = playerName;
		Team = playerTeam;
		Position = playerPos;
		Fgm = playerFgm;
		Fgatt = playerFgatt;
		Pct19 = playerPct19;
		Blk19 = playerBlk19;
		Lng19 = playerLng19;
		Am29 = playerAm29;
		Pct29 = playerPct29;
		Am39 = playerAm39;
		Pct39 = playerPct39;
		Am49 = playerAm49;
		Pct49 = playerPct49;
		Am50plus = playerAm50plus;
		Pct50plus = playerPct50plus;
		Xpm = playerXpm;
		XPatt = playerXpatt;
		Pctpat = playerPctpat;
		Blkpat = playerBlkpat;
		
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
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getFgm() {
		return Fgm;
	}
	public void setFgm(String fgm) {
		Fgm = fgm;
	}
	public String getFgatt() {
		return Fgatt;
	}
	public void setFgatt(String fgatt) {
		Fgatt = fgatt;
	}
	public String getPct19() {
		return Pct19;
	}
	public void setPct19(String pct19) {
		Pct19 = pct19;
	}
	public String getBlk19() {
		return Blk19;
	}
	public void setBlk19(String blk19) {
		Blk19 = blk19;
	}
	public String getLng19() {
		return Lng19;
	}
	public void setLng19(String lng19) {
		Lng19 = lng19;
	}
	public String getAm29() {
		return Am29;
	}
	public void setAm29(String am29) {
		Am29 = am29;
	}
	public String getPct29() {
		return Pct29;
	}
	public void setPct29(String pct29) {
		Pct29 = pct29;
	}
	public String getAm39() {
		return Am39;
	}
	public void setAm39(String am39) {
		Am39 = am39;
	}
	public String getPct39() {
		return Pct39;
	}
	public void setPct39(String pct39) {
		Pct39 = pct39;
	}
	public String getAm49() {
		return Am49;
	}
	public void setAm49(String am49) {
		Am49 = am49;
	}
	public String getPct49() {
		return Pct49;
	}
	public void setPct49(String pct49) {
		Pct49 = pct49;
	}
	public String getPct50plus() {
		return Pct50plus;
	}
	public void setPct50plus(String pct50plus) {
		Pct50plus = pct50plus;
	}
	public String getAm50plus() {
		return Am50plus;
	}
	public void setAm50plus(String pct50plsu) {
		Am50plus = pct50plsu;
	}
	public String getXpm() {
		return Xpm;
	}
	public void setXpm(String xpm) {
		Xpm = xpm;
	}
	public String getXPatt() {
		return XPatt;
	}
	public void setXPatt(String xPatt) {
		XPatt = xPatt;
	}
	public String getPctpat() {
		return Pctpat;
	}
	public void setPctpat(String pctpat) {
		Pctpat = pctpat;
	}
	public String getBlkpat() {
		return Blkpat;
	}
	public void setBlkpat(String blkpat) {
		Blkpat = blkpat;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
}
