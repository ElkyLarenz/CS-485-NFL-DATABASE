package userInteractions_JAVA;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name = "userlogins")
public class userLoginInfo {
	
		private static int ID;
		 @Column(name="userName")
		private static String cardN;
		 @Column(name="Password")
		private String passW;
		 @Column(name="FN")
		private static String FN;
		 @Column(name="LN")
		private static String LN;
		
		public static int getID() {
			return ID;
		}
		public void setID(int id) {
			this.ID = id;	
		}
		public static String getcardN() {
			return cardN;
		}
		public void setcardN(String card) {
			this.cardN = card;	
		}
		public String getpassW() {
			return passW;
		}
		public void setpassW(String pw) {
			this.passW = pw;	
		}
		public static String getFN() {
			return FN;
		}
		public void setFN(String FN) {
			userLoginInfo.FN = FN;	
		}
		public static String getLN() {
			return LN;
		}
		public void setLN(String LN) {
			userLoginInfo.LN = LN;	
		}
	}

