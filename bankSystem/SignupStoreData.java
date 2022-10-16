package bankSystem;


import java.sql.*;

import javax.swing.JOptionPane;


public class SignupStoreData {
	static String Username=SignUpPage.FullName.getText(); 
	static String Useremail=SignUpPage.EmailId.getText();
	static String Gender=SignUpPage.gender;
	static String Phonenumber=SignUpPage.PhoneNumber.getText();
	static String Useraccountnumber=SignUpPage.AccountNumber.getText();
	static String Userpassword=SignUpPage.passwordField.getText();


	static public void Signup() { 

		String acc1=Credentials.getAccount();

		if(Useraccountnumber.equals(acc1)) {
			JOptionPane.showMessageDialog(null, "Account already Exist","Data Save",1);

		}
		else {

			try {


				String query="insert into SignupInfo values(?,?,?,?,?,?)";

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root", "root");
				PreparedStatement stmt=con.prepareStatement(query);


				stmt.setString(1,Username);
				stmt.setString(2,Useremail);
				stmt.setNString(3,Gender); 
				stmt.setString(4,Phonenumber);
				stmt.setString(5,Useraccountnumber);
				stmt.setString(6,Userpassword);

				int i=stmt.executeUpdate();

				System.out.println(i+" records inserted");
				JOptionPane.showMessageDialog(null, "Account Create","Data Save",1);


				con.close();

			}

			catch (Exception e1) { e1.printStackTrace(); System.out.println("Exit"); }

		}

	}


}
