package bankSystem;


import java.sql.*;
import javax.swing.JOptionPane;

public class TransactionControl {

	public static void main(String [] args) {

		String a="a"+SignUpPage.AccountNumber.getText();


		try { 

			String query="create table "+a+"("+"Account varchar(12)"+","+"Balance varchar(20)"+","+"Type varchar(20)"+")";
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
