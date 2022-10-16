package bankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class InsertMoney {

	public static void main(String [] args) {

		String a="a"+Credentials.getAccount();


		try { 

			String query="Insert into"+a+"values(?,?,?)";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root", "root");
			PreparedStatement stmt=con.prepareStatement(query);

			int i=stmt.executeUpdate();

			System.out.println(i+" records inserted");
			JOptionPane.showMessageDialog(null, "Account Create","Data Save",1);


			con.close();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}



	}

}
