package bankSystem;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.*;


public class MainPage implements ActionListener {
	protected static final String[] args = null;
	static JFrame frame;
	private JTextField txtA;
	private JPasswordField passwordField;
	private JTextField textField;


	MainPage()
	{
		createWindow();
		

	}
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

		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(148, 0, 211));
		btnNewButton_1.setBorder(border);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(53, 302, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpPage.main(args);
				frame.dispose();
			}
		});

		panel.add(btnNewButton_1);

		JLabel lblNewLabel_3 = new JLabel("WELCOME");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_3.setBounds(10, 11, 167, 40);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("TO");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_4.setBounds(69, 66, 54, 30);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("HN BANK");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(20, 109, 157, 43);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));

		txtA = new JTextField();
		txtA.setToolTipText("Enter Account Number");
		txtA.setBounds(344, 103, 212, 20);
		frame.getContentPane().add(txtA);


		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Password");
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(344, 150, 212, 20);
		frame.getContentPane().add(passwordField);

		textField = new JTextField();
		textField.setBounds(344, 199, 212, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Account Number :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(197, 105, 129, 17);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassword.setBounds(197, 152, 107, 17);
		frame.getContentPane().add(lblPassword);

		JLabel lblNewLabel_1_1 = new JLabel("Confirm Password :");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(197, 201, 129, 17);
		frame.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(148, 0, 211));
		btnNewButton.setBorder(border);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(474, 243, 82, 23);
		frame.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String Account=txtA.getText();
				String Password=passwordField.getText();
				String ConfirmPassword=textField.getText();

				if(Account.isEmpty()){
					JOptionPane.showMessageDialog(null, "Enter Account Number");
				}
				else if(!Pattern.matches("[0-9]{12}+",Account)) {
					JOptionPane.showMessageDialog(null,"Invalid Account Number","Wrong",JOptionPane.WARNING_MESSAGE);
				} 
				else if(!Pattern.matches("[a-zA-z0-9]+",Password)) {
					JOptionPane.showMessageDialog(null,"Invalid Password check Your Password","Wrong",JOptionPane.WARNING_MESSAGE);					
				}
				else if(passwordField.getText().isEmpty()||textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Enter Password");
				}

				else if(!Password.equalsIgnoreCase(ConfirmPassword)) {
					JOptionPane.showMessageDialog(null, "Passsword Not Match");
				}
				else {
					Controller.checkAccount(Account, Password);
				}

				
				
			
			}
		});

		
		JLabel lblNewLabel_1 = new JLabel("Forgot Password ?");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(344, 247, 120, 14);
		btnNewButton.setBorder(border);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ChangePassword.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

	}
	public static void main(String[] args)
	{
		new  MainPage();
	}

	
}