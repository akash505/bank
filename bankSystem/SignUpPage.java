package bankSystem;


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.util.regex.Pattern;
import java.awt.*;


public class SignUpPage implements ActionListener {

	JFrame frame;
	/* String[] gender={"Male","Female"}; */

	static  JTextField FullName,EmailId,PhoneNumber,AccountNumber,ConfirmPassword,passwordField;
	@SuppressWarnings("rawtypes")
	static JComboBox box;

	static String gender;
	SignUpPage()
	{
		createWindow();

	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void createWindow()
	{

		Border border=BorderFactory.createLineBorder(Color.blue,1);
		frame=new JFrame();
		frame.setTitle("Registration Form");
		frame.setBounds(40,40,600,417);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 187, 378);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		//		Border border=BorderFactory.createLineBorder(Color.blue,1);
		btnNewButton_1.setBorder(border);
		btnNewButton_1.setBackground(new Color(148, 0, 211));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(55, 295, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			private String[] args;

			public void actionPerformed(ActionEvent e) {
				MainPage.main(args);
				frame.dispose();
			}
		});

		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("NEW ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 45));
		lblNewLabel_2.setBounds(31, 21, 125, 61);

		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("USER");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 45));
		lblNewLabel_3.setBounds(31, 107, 125, 47);
		panel.add(lblNewLabel_3);

		FullName = new JTextField();
		FullName.setFont(new Font("Tahoma", Font.BOLD, 11));
		FullName.setToolTipText("Enter Full Name");
		FullName.setBounds(344, 77, 212, 20);
		frame.getContentPane().add(FullName);
		//        AccountNumber.setColumns(10);

		EmailId = new JTextField();
		EmailId.setBounds(344, 108, 212, 20);
		frame.getContentPane().add(EmailId);

		JLabel lblNewLabel = new JLabel("Full Name :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(197, 79, 129, 17);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(border);
		btnNewButton.setBackground(new Color(148, 0, 211));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(475, 294, 82, 23);
		frame.getContentPane().add(btnNewButton);


		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailId.setBounds(197, 110, 129, 17);
		frame.getContentPane().add(lblEmailId);

		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender.setBounds(197, 142, 129, 17);
		frame.getContentPane().add(lblGender);

		PhoneNumber = new JTextField();
		PhoneNumber.setColumns(10);
		PhoneNumber.setBounds(344, 170, 212, 20);
		frame.getContentPane().add(PhoneNumber);

		AccountNumber = new JTextField();
		AccountNumber.setColumns(10);
		AccountNumber.setBounds(344, 201, 212, 20);
		frame.getContentPane().add(AccountNumber);

		ConfirmPassword = new JTextField();
		ConfirmPassword.setColumns(10);
		ConfirmPassword.setBounds(344, 263, 212, 20);
		frame.getContentPane().add(ConfirmPassword);

		JLabel lblNewLabel_5_1 = new JLabel("Phone Number :");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(197, 173, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("Account Number :");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(197, 204, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2);

		JLabel lblNewLabel_5_3 = new JLabel("Password :");
		lblNewLabel_5_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_3.setBounds(197, 235, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_3);

		JLabel lblNewLabel_5_4 = new JLabel("Confirm Password :");
		lblNewLabel_5_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_4.setBounds(197, 266, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_4);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(344, 232, 212, 20);
		frame.getContentPane().add(passwordField);


		box = new JComboBox();
		box.setBackground(new Color(255, 255, 255));
		// String[] Box=new String[] {"", "Male", "Female", "Confidential"};
		String Box[]={" ", "Male", "Female", "Confidential"};
		box.setModel(new DefaultComboBoxModel(Box));
		box.setBounds(344, 139, 212, 22);
		gender=(String) box.getItemAt(box.getSelectedIndex());
		frame.getContentPane().add(box);


		JLabel lblNewLabel_1 = new JLabel("HN BANK");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1.setBounds(328, 11, 138, 34);
		frame.getContentPane().add(lblNewLabel_1);


		/*
		 * 
		 *  
		 *  
		 *  
		 *  Check input and store condition 
		 *  
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   */

		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			private String[] args;

			public void actionPerformed(ActionEvent e) {

				String account=AccountNumber.getText();
				String name=FullName.getText();
				String pass=passwordField.getText();
				String phonenumber=PhoneNumber.getText();
				String confirmpassword=ConfirmPassword.getText();
				String email=EmailId.getText();



				if(account.isEmpty()||name.isEmpty()||email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
				}
				else if(!Pattern.matches("[a-zA-Z ]+",name)) {
					JOptionPane.showMessageDialog(null,"Invalid Input in Name","Check Name",2);
				}
				else if(!Pattern.matches("[A-Za-z0-9]+@[A-Za-z-_]+(?:\\.[com]+){1}+",email)) {
					JOptionPane.showMessageDialog(null,"Invalid type in Email","Bank",JOptionPane.WARNING_MESSAGE);
				}
				else if(box.getSelectedItem().equals(" ")) {
					JOptionPane.showMessageDialog(null,"Select Gender","Bank" ,2);
				}
				else if(!Pattern.matches("[0-9]{10}",phonenumber)) {
					JOptionPane.showMessageDialog(null,"Enter a Valid Mobile Number","Check Number",2);
				}
				else if(!Pattern.matches("[0-9]{12}",account)) {
					JOptionPane.showMessageDialog(null,"Check Account Number ","Check length",2);
				}				
				else if(!Pattern.matches("[a-zA-Z0-9]+",pass)){ 
					JOptionPane.showMessageDialog(null,"Enter a Valid Password","Check Number",2);
				}
				else if(!confirmpassword.equalsIgnoreCase(pass)){
					JOptionPane.showMessageDialog(null,"Password Doesn't Match","Confirm Password" ,2);
				} 
				else {
					SignupController.checkAccount(account);
				}
			}
		});

		/*
		 * 
		 *  
		 *  
		 *  
		 *  End check Condition
		 *  
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   */


		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}



	@Override
	public void actionPerformed(ActionEvent e) {

	}
	public static void main(String[] args)
	{
		new SignUpPage();
	}
}