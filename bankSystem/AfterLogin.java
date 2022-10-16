package bankSystem;

import javax.swing.*;
import java.awt.event.*;
import java.io.Console;
import java.io.Flushable;
import java.io.IOException;
import java.awt.*;


public class AfterLogin  {
	protected static final String[] args = null;
	JFrame frame;



	AfterLogin()
	{
		createWindow();

	}
	
	public void createWindow()
	{

		frame=new JFrame();
		frame.setBounds(40,40,600,417);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 187, 378);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
//		JLabel lblNewLabel = new JLabel("Change Password ?");
//		lblNewLabel.setForeground(new Color(0, 0, 139));
//		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
//		lblNewLabel.setBounds(34, 341, 129, 26);
//		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		lblNewLabel.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				CHpassword.main(args);
////				ChangePassword.main(args);
////				frame.dispose();
////				frame.getDefaultCloseOperation();
//			}
//		});
//		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5_2 = new JLabel("Account Number :");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(197, 92, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2);

		JLabel lblNewLabel_1 = new JLabel("HN BANK");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1.setBounds(328, 11, 138, 34);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_5_2_1 = new JLabel("Name :");
		lblNewLabel_5_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_1.setBounds(197, 120, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2_1);

		JLabel AccountNumberLabel = new JLabel(Credentials.getAccount());
		AccountNumberLabel.setFont(new Font("Arial", Font.BOLD, 14));
		AccountNumberLabel.setBounds(379, 89, 159, 20);
		frame.getContentPane().add(AccountNumberLabel);

		JLabel AccountNameLabel_2 = new JLabel(Credentials.getName());
		AccountNameLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		AccountNameLabel_2.setBounds(382, 117, 156, 20);
		frame.getContentPane().add(AccountNameLabel_2);

		JButton btnNewButton = new JButton("Deposit Money");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(139, 0, 139));
		btnNewButton.setBounds(197, 197, 180, 59);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMoney.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Withdraw Money");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(139, 0, 139));
		btnNewButton_2.setBounds(379, 197, 187, 59);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawMoney.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton(" Transaction");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(139, 0, 139));
		btnNewButton_3.setBounds(197, 267, 180, 63);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				WithdrawMoney.main(args);
				Transaction.main(args);
//				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Transfer Money");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(139, 0, 139));
		btnNewButton_4.setBounds(379, 267, 187, 63);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransferMoney.main(args);
				frame.dispose();
			}
		});
		
		frame.getContentPane().add(btnNewButton_4);

		JLabel lblNewLabel_5_2_1_1 = new JLabel("Balance :");
		lblNewLabel_5_2_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_1_1.setBounds(197, 148, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2_1_1);

		JLabel lblNewLabel_5_2_1_2 = new JLabel(String.valueOf(Credentials.getamount()));/// BAlance 
		lblNewLabel_5_2_1_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_1_2.setBounds(379, 149, 129, 17);
				
		frame.getContentPane().add(lblNewLabel_5_2_1_2);
		
		
		JButton btnNewButton_1 = new JButton("Sign Out");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(148, 0, 211));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(35, 295, 128, 35);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage.main(args);
//				String s =String.valueOf(Credentials.getamount());
//				try {
//					s.flush();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				frame.dispose();
				frame.getDefaultCloseOperation();
		
								
			}
		});
		panel.add(btnNewButton_1);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
	}

	
	public static void main(String[] args)
	{
		new AfterLogin();
	}
}