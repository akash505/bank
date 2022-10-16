package bankSystem;

import java.sql.*;


public class Transactioncheckdata{

	public static void main(String args[]) {
		String account="a"+Credentials.getAccount();
		String Account=Credentials.getAccount();
		String Balance=String.valueOf(Balanceinfo.balance);
		String Type=Balanceinfo.show;
 
		try { 
			String query="Insert into "+account+" values(?,?,?)";
 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root", "root");
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,Account);
			stmt.setString(2,Balance); 
			Credentials.setamount(Float.parseFloat(Balance));
			stmt.setNString(3,Type); 

			int i=stmt.executeUpdate();

			System.out.println(i+" records inserted");
			//			JOptionPane.showMessageDialog(null, "Account Create","Data Save",1);

			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
