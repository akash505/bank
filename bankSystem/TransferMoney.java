package bankSystem;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

public class TransferMoney{
	protected static final String[] args = null;
	JFrame frame;
	static String Account;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	

	TransferMoney()
	{
		createWindow();

	}
	public void createWindow()
	{
		frame=new JFrame();

		frame.setBounds(40,40,599,393);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 187, 354);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("TRANSFER");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(10, 33, 167, 34);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("MONEY");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(33, 89, 117, 34);
		panel.add(lblNewLabel_1_1_1);

		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(128, 0, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(98, 191, 89, 23);
		panel.add(btnNewButton_2);

//		JButton btnNewButton_2_1 = new JButton("Home");
//		btnNewButton_2_1.setForeground(Color.WHITE);
//		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 14));
//		btnNewButton_2_1.setBackground(new Color(128, 0, 128));
//		btnNewButton_2_1.setBounds(98, 237, 89, 23);
//		panel.add(btnNewButton_2_1);

//		JButton btnNewButton_2_2 = new JButton("Home");
//		btnNewButton_2_2.setForeground(Color.WHITE);
//		btnNewButton_2_2.setFont(new Font("Arial", Font.BOLD, 14));
//		btnNewButton_2_2.setBackground(new Color(128, 0, 128));
//		btnNewButton_2_2.setBounds(98, 285, 89, 23);
//		panel.add(btnNewButton_2_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				MainPage.main(args);
				AfterLogin.main(args);
				frame.dispose();
			}
		});

		JLabel lblNewLabel_5_2 = new JLabel("Password :");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(197, 131, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2);

		JLabel lblNewLabel_1 = new JLabel("HN BANK");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1.setBounds(328, 11, 138, 34);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_5_2_2 = new JLabel("Enter Account Number:");
		lblNewLabel_5_2_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_2.setBounds(197, 89, 151, 17);
		frame.getContentPane().add(lblNewLabel_5_2_2);

		textField = new JTextField();
		textField.setBounds(348, 87, 210, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(348, 129, 210, 20);
		frame.getContentPane().add(textField_1);


		JLabel lblNewLabel_5_2_1 = new JLabel("Confirm Password:");
		lblNewLabel_5_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_1.setBounds(197, 174, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(348, 172, 210, 20);
		frame.getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(469, 204, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Account=textField.getText();
				String Password=textField_1.getText();
				String ConfirmPassword=textField_2.getText();
				String pass=Credentials.getPass(); 

				if(Account.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Enter Account Number ","Bank", JOptionPane.ERROR_MESSAGE);
				}
				else if(!Pattern.matches("[0-9]+",Account)) {
					JOptionPane.showMessageDialog(null, "Enter Valid Input","Check length",2);
				}
				else if(!Pattern.matches("[0-9]+",Password)) {
					JOptionPane.showMessageDialog(null, "Enter Valid Input in Password","Check length",2);
				}
				else if(!Password.equalsIgnoreCase(ConfirmPassword)) {
					JOptionPane.showMessageDialog(null,"Password Not Match","Bank", JOptionPane.WARNING_MESSAGE);	
				}
				else if (Password.equals(pass)) {
					Transactioncheckdata.main(args);
//					TransferMoneyController.Transaction(Account);
					Balanceinfo.Transfer(frame); 
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter Valid Password ","Bank", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		frame.getContentPane().add(btnNewButton);
		//		frame.setUndecorated(true);
		frame.setVisible(true);
		//		frame.setUndecorated(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}



	//    @Override
	//    public void actionPerformed(ActionEvent e) {
	// 
	//    }
	public static void main(String[] args)
	{
		new TransferMoney();
	}
}
