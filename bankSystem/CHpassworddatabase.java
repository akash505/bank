package bankSystem;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CHpassworddatabase {


	static String Pass; 
	private static String[] args;

	public static boolean checkAccount(String account,String name) {
		System.out.println(name+account);
		try {  
			String query="Select * From Signupinfo where Full_Name="+"'"+name+"'"+"And Account_Number="+account; 


			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);

			boolean flag=r1.next();
			String a=r1.getString("Account_Number");
			String b=r1.getString("Full_Name");

			while(flag) {
				System.out.println(a);
				if(account.equalsIgnoreCase(a)) {
					JOptionPane.showMessageDialog(null,"Account Number Check");
					if(name.equalsIgnoreCase(b)){
						JOptionPane.showMessageDialog(null,"Name Match");
						System.out.println("Ok ");
						JOptionPane.showMessageDialog(null,"Processing");
						Component frame = null;
						Pass = JOptionPane.showInputDialog(frame,"Enter New Password Only in Numeric form Starts with '1'","Bank", JOptionPane.PLAIN_MESSAGE);
						CHpassworddatabase.InputPassword();
						System.out.print("work1");
						return flag=true;
					}
				}
			}
			JOptionPane.showMessageDialog(null,"Account Not  Match","Bank", JOptionPane.WARNING_MESSAGE);
			System.out.print("work1");
			return flag=false;

		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,"Not Working","Bank", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
		System.out.print("work1");
		return false;


	}

	static public void InputPassword() { 
		String a=CHpassworddatabase.Pass;



		try { String query="Update Signupinfo SET Password = ? Where Account_Number="+a ;

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root"); 
		PreparedStatement stmt=connection.prepareStatement(query);
		stmt.setString(1,a);

		int i=stmt.executeUpdate();

		System.out.println(i+" records inserted");


		connection.close();

		}catch (SQLException e1) {
			e1.printStackTrace();
		}

	}




}
