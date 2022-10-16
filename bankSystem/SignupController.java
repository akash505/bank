package bankSystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class SignupController {


	private static String[] args;

	public static boolean checkAccount(String account) {


		try { 
			String query="Select * From SignupInfo where Account_Number="+account; 

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);
			boolean flag=r1.next();
			while(flag) {
				JOptionPane.showMessageDialog(null,"Account Already Exist","Bank",JOptionPane.ERROR_MESSAGE);
				connection.close();
				return flag=true;

			}
			SignupStoreData.Signup();
			TransactionControl.main(args);
			MainPage.main(args);
			System.out.println("Not Exist");
			connection.close(); 
			return flag=false;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;


	}

}
