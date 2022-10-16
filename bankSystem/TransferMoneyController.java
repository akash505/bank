package bankSystem;



import java.sql.*;
import javax.swing.*;

public class TransferMoneyController {

	public static  boolean Transaction(String accountcheck){ 
		try {

			String query="Select * From SignupInfo where Account_Number="+accountcheck;

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);
			boolean flag=r1.next();
			while(flag) { 
 
				System.out.println("Account Exist");
				JOptionPane.showMessageDialog(null,"Account Exsit");
				 
				Transactioncheckdata.main(null);
				//				BalanceInfocheck.Transfer();
				//				ExistData.Transaction();
				connection.close();
				return flag=true;

			}
			JOptionPane.showMessageDialog(null,"Account Not Exsit"+"Transfer is not possible");
			System.out.println("Account not exist");
			return flag=false;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;

	}

}
