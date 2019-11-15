package playerInfo_Scrape_JAVA;

public class defensiveLineman {
	private String Rank;
	private String Name;
	private String Team;
	private String Pos;
	private String Comb;
	private String Total;
	private String Ast;
	private String Sck;
	private String Sfty;
	private String Pdef;
	private String Int;
	private String Tds;
	private String Yds;
	private String Lng;
	private String Ff;
	private String Rec;
	private String Td;
	private int Id;
	
	public defensiveLineman(String ra, String na, String te, String pos1, String comb1, String tot, String ast, String sck, String sfty,
			String pdef, String inter, String tds, String yds, String lng, String ff, String rec, String td)
	{
		Rank = ra;
		Name = na;
		Team = te;
		Pos = pos1;
		Comb = comb1;
		Total = tot;
		Ast = ast;
		Sck = sck;
		Sfty = sfty;
		Pdef = pdef;
		Int = inter;
		Tds = tds;
		Yds = yds;
		Lng = lng;
		Ff = ff;
		Rec = rec;
		Td = td;
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
	public String getComb() {
		return Comb;
	}
	public void setComb(String comb) {
		Comb = comb;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	public String getAst() {
		return Ast;
	}
	public void setAst(String ast) {
		Ast = ast;
	}
	public String getSck() {
		return Sck;
	}
	public void setSck(String sck) {
		Sck = sck;
	}
	public String getSfty() {
		return Sfty;
	}
	public void setSfty(String sfty) {
		Sfty = sfty;
	}
	public String getPdef() {
		return Pdef;
	}
	public void setPdef(String pdef) {
		Pdef = pdef;
	}
	public String getInt() {
		return Int;
	}
	public void setInt(String i) {
		Int = i;
	}
	public String getTds() {
		return Tds;
	}
	public void setTds(String tds) {
		Tds = tds;
	}
	public String getYds() {
		return Yds;
	}
	public void setYds(String yds) {
		Yds = yds;
	}
	public String getLng() {
		return Lng;
	}
	public void setLng(String lng) {
		Lng = lng;
	}
	public String getFf() {
		return Ff;
	}
	public void setFf(String ff) {
		Ff = ff;
	}
	public String getRec() {
		return Rec;
	}
	public void setRec(String rec) {
		Rec = rec;
	}
	public String getTd() {
		return Td;
	}
	public void setTd(String td) {
		Td = td;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	

}
