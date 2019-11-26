package beans;

public class kickoffKicker {
	private int Id;
	private String Ranked;
	private String Name;
	private String Team;
	private String Position;
	private String Ko;
	private String Yards;
	private String Oob;
	private String Average;
	private String Tb;
	private String Pct;
	private String Ret;
	private String Avg2;
	private String Td;
	private String Osk;
	private String Oskr;
	
	public kickoffKicker(String ra, String na, String te, String po, String ko, String ya, String oo, String av, String tb, String pc, String re,
			String av2, String td, String osk, String oskr)
	{
			Ranked = ra;
			Name = na;
			Team = te;
			Position = po;
			Ko = ko;
			Yards = ya;
			Oob = oo;
			Average = av;
			Tb = tb;
			Pct = pc;
			Ret = re;
			Avg2 = av2;
			Td = td;
			Osk = osk;
			Oskr = oskr;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRanked() {
		return Ranked;
	}
	public void setRanked(String ranked) {
		Ranked = ranked;
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
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getKo() {
		return Ko;
	}
	public void setKo(String ko) {
		Ko = ko;
	}
	public String getYards() {
		return Yards;
	}
	public void setYards(String yards) {
		Yards = yards;
	}
	public String getOob() {
		return Oob;
	}
	public void setOob(String oob) {
		Oob = oob;
	}
	public String getAverage() {
		return Average;
	}
	public void setAverage(String average) {
		Average = average;
	}
	public String getTb() {
		return Tb;
	}
	public void setTb(String tb) {
		Tb = tb;
	}
	public String getPct() {
		return Pct;
	}
	public void setPct(String pct) {
		Pct = pct;
	}
	public String getRet() {
		return Ret;
	}
	public void setRet(String ret) {
		Ret = ret;
	}
	public String getAvg2() {
		return Avg2;
	}
	public void setAvg2(String avg2) {
		Avg2 = avg2;
	}
	public String getTd() {
		return Td;
	}
	public void setTd(String td) {
		Td = td;
	}
	public String getOsk() {
		return Osk;
	}
	public void setOsk(String osk) {
		Osk = osk;
	}
	public String getOskr() {
		return Oskr;
	}
	public void setOskr(String oskr) {
		Oskr = oskr;
	}

}
