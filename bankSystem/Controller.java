package bankSystem;


import java.sql.*;
import javax.swing.*;
//import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

public class Controller {

	private static String[] args;

	public static boolean  checkAccount(String account,String pass) {

		try { 
			String query="Select * From SignupInfo where Account_Number="+"'"+account+"'"+"And Password="+pass; 

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);
			boolean flag=r1.next();

			while(flag) {
				Credentials.setName(r1.getString("Full_Name")); 
				Credentials.setAccount(r1.getString("Account_Number"));
				Credentials.setPass(pass);
				Test.main(args);
				Credentials.getamount();				
				AfterLogin.main(args);
				MainPage.frame.dispose();
				return flag=true;
			}
			JOptionPane.showMessageDialog(null,"Login Fail","Bank",JOptionPane.WARNING_MESSAGE);
			return flag=false;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;


	}




}

