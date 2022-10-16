package bankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Test {
	static float s;
//	static String[] columnNames = { "Account Number", "Amount ", "Type"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		String Accountnumber= "";
//
//		String Amount = "";
//
//		String Info = "";
//		DefaultTableModel model = new DefaultTableModel();
//
//		model.setColumnIdentifiers(columnNames);
		try {
			String amount="a"+Credentials.getAccount();
			String query="Select Balance from "+amount;

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);
			System.out.print(r1);


			while(r1.next()) {
				s=r1.getFloat("Balance");								

//				Accountnumber=r1.getString("Account");
//				
//				Amount=String.valueOf(r1.getLong("Balance"));
				Credentials.setamount(s);
//				Info=r1.getString("Type");
//				
//				model.addRow(new Object[] { Accountnumber, Amount, Info/* , cou */});
				System.out.println(r1.getFloat(1));  
//				connection.close();
				

//				System.out.println(r1.getString("Account")+" "+r1.getLong("Balance")+" "+r1.getString("Type"));

			}
			System.out.print(s);

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

		}


	}

}
