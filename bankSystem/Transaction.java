package bankSystem;



import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;



import java.awt.*;


public class Transaction {
	static JFrame frame;
	static JTextArea tx;
	static JPanel panel;
	static JButton btn;
	private static JTable table;

	static String[] columnNames = { "Account Number", "Amount ", "Type"};

	public static void main(String[] args)
	{
		frame = new JFrame("Database Search Result");

		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());

		DefaultTableModel model = new DefaultTableModel();

		model.setColumnIdentifiers(columnNames);



		table = new JTable();

		table.setRowSelectionAllowed(false);

		table.setModel(model);


		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		table.setFillsViewportHeight(true);


		JScrollPane scroll = new JScrollPane(table);

		scroll.setHorizontalScrollBarPolicy(

				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		scroll.setVerticalScrollBarPolicy( 

				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);



		String Accountnumber= "";

		String Amount = "";

		String Info = "";

		//  String cou = "";


		try {
			String amount="a"+Credentials.getAccount();
			String query="Select * From "+amount;

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root","root");

			Statement st=connection.createStatement();
			ResultSet r1=st.executeQuery(query);


			while(r1.next()) {

				Accountnumber=r1.getString("Account");
				Amount=String.valueOf(r1.getLong("Balance"));
				Info=r1.getString("Type");
 
				model.addRow(new Object[] { Accountnumber, Amount, Info/* , cou */});

				System.out.println(r1.getString("Account")+" "+r1.getLong("Balance")+" "+r1.getString("Type"));

			}

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

		}

		frame.add(scroll);
		table.setEnabled(false);

		frame.setVisible(true);

		frame.setSize(400, 300);

	}


}
