package bankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BalanceEnquiry {

	static float s;
	static float sum =0;
	static String a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="jdbc:mysql://localhost:3306/Bank1";
		String Username="root";
		String Pass="root";
		String amount="a"+Credentials.getAccount();
		String query="SELECT Balance FROM "+amount;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(host, Username, Pass);
			PreparedStatement stmt =con.prepareStatement(query);
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
			s=rs.getFloat("Amount");
			
			ArrayList<Float> list = new ArrayList<Float>();
			list.add(s);
			for(int j=0; j<list.size();j++) {
				sum=sum+list.get(j);
				System.out.print("sk");
			}
		}
			a=a.valueOf(sum);
		}
		catch(Exception e) {
			
		}

	}

}
