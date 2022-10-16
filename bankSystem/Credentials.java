package bankSystem;



public class Credentials {
	private static String AccountNumber;
	private static String FullName;
	private static String EmailId;
	private static float Amount;
	private static String password;
	private static String AccountTable;
	
	static void setAccountT(String AccountH) {
		AccountTable=AccountH;
	}
	static String getAccountH() {
		return AccountTable;
	}
	
	static void setAccount(String Account) {
		AccountNumber=Account;
	}
	static String getAccount() {
		return AccountNumber;
	}
	static void setName(String name) {
		FullName=name;
	}
	static String getName() {
		return FullName;
	}
	static String setEmail(String email) {
		return EmailId=email;
	}
	static String getEmail() {
		return EmailId;
	}
	static void setamount(float balance1) {
		Amount=balance1;
	}
	static float getamount() {
		return Amount;
	}
	static void setPass(String Password) {
		password=Password;
	}
	static String getPass() {
		return password;
	}

}
