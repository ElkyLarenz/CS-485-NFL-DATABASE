package beans;

public class team {
	private int id;
	private String name;
	private String wins;
	private String losses;
	private String ties;
	private String pct;
	private String pf;
	private String pa;
	private String home;
	private String away;
	private String conf;
	private String divi;
	private String strk;
	
	public team(String na, String wi, String lo, String ti, String pc, String pf, String pa, String ho, String aw, String co,
			String di, String st)
	{
		name = na;
		wins = wi;
		losses = lo;
		ties = ti;
		pct = pc;
		this.pf = pf;
		this.pa = pa;
		home = ho;
		away = aw;
		conf = co;
		divi = di;
		strk = st;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getwins() {
		return wins;
	}
	public void setwins(String wins) {
		this.wins = wins;
	}
	public String getlosses() {
		return losses;
	}
	public void setlosses(String losses) {
		this.losses = losses;
	}
	public String getties() {
		return ties;
	}
	public void setties(String ties) {
		this.ties = ties;
	}
	public String getpct() {
		return pct;
	}
	public void setpct(String pct) {
		this.pct = pct;
	}
	public String getpf() {
		return pf;
	}
	public void setpf(String pf) {
		this.pf = pf;
	}
	public String getpa() {
		return pa;
	}
	public void setpa(String pa) {
		this.pa = pa;
	}
	public String gethome() {
		return home;
	}
	public void sethome(String home) {
		this.home = home;
	}
	public String getaway() {
		return away;
	}
	public void setaway(String away) {
		this.away = away;
	}
	public String getconf() {
		return conf;
	}
	public void setconf(String conf) {
		this.conf = conf;
	}
	public String getdivi() {
		return divi;
	}
	public void setdivi(String div) {
		this.divi = div;
	}
	public String getstrk() {
		return strk;
	}
	public void setstrk(String strk) {
		this.strk = strk;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	
}
