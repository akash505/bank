package bankSystem;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.util.regex.Pattern;
import java.awt.Font;
import java.awt.Color;

public class AddMoney{
	static JFrame frame;
	static JLabel Heading,label2,label4,label6,label7;
	static JTextField amount,confirmpassword;
	static JPasswordField password;
	static JPanel panel;
	static JButton btn1,Home,btn4;
	//	static String withdraw;
	static String Password,Confirm,Amount;
	private static JLabel lblNewLabel_1;
	private static JTextField textField;
	private static JLabel lblChechNumber;
	private static JRadioButton rdbtnNewRadioButton;
	private static JRadioButton rdbtnNewRadioButton_1;
	private static JLabel lblNewLabel_2;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Border border=BorderFactory.createLineBorder(Color.blue,1);
		Password=Credentials.getPass();

		frame =new JFrame();
		label2=new JLabel("Enter Amount :");
		label2.setBounds(209,115,110,30);
		label4=new JLabel("Help ?");
		label6=new JLabel("Password :");
		label6.setBounds(209,155,140,30);
		label7=new JLabel("Confirm Password :");
		label7.setBounds(209,194,140,30);


		amount=new JTextField();

		//amount.setFont(new Font("Arial",Font.BOLD,12));
		amount.setBounds(360,120,210,20);

		confirmpassword=new JTextField();
		confirmpassword.setBounds(360,200,210,20);
		confirmpassword.setFont(new Font("Arial",Font.BOLD,12));


		password=new JPasswordField();
		password.setFont(new Font("Arial",Font.BOLD,20));
		password.setBounds(360,160,210,20);

		btn1=new JButton("Submit");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(148, 0, 211));
		btn1.setFont(new Font("Arial", Font.BOLD, 13));
		btn1.setBounds(494,271,80,20);
		btn1.addActionListener(new ActionListener () {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String text=amount.getText();

				if(password.getText().equalsIgnoreCase(Password)&& confirmpassword.getText().equalsIgnoreCase(Password)) {

					if(!Pattern.matches("[0-9]+(.([0-9]+)?){1}+",text)) {
						JOptionPane.showMessageDialog(null, "Enter Valid Amount","Message",JOptionPane.WARNING_MESSAGE);
					}else {
						Balanceinfo.Deposite();
					}

				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect Password","Password",JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		panel=new JPanel();
		panel.setBounds(1,1,200,360);
		panel.setLayout(null);
		panel.setBackground(new Color(139, 0, 139));

		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(password);
		frame.getContentPane().add(label6);
		frame.getContentPane().add(label7);
		frame.getContentPane().add(confirmpassword);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel(" DEPOSIT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel.setBounds(10, 11, 180, 69);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("MONEY");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 35));
		lblNewLabel_1.setBounds(34, 91, 133, 36);
		panel.add(lblNewLabel_1);

		Home=new JButton("Home");
		Home.setBackground(new Color(148, 0, 211));
		Home.setForeground(new Color(255, 255, 255));
		Home.setBounds(27, 301, 140, 30);
		panel.add(Home);
		Home.setFont(new Font("Arial", Font.BOLD, 22));


		Home.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				AfterLogin.main(args);
				frame.dispose();
			}
		});

		frame.getContentPane().add(amount);
		frame.getContentPane().add(btn1);
		frame.getContentPane().setLayout(null);

		Heading=new JLabel("HN Bank");
		Heading.setForeground(new Color(128, 0, 128));
		Heading.setBounds(305, 11, 179, 44);
		frame.getContentPane().add(Heading);
		Heading.setFont(new Font("Arial", Font.BOLD, 40));

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 12));
		textField.setBounds(360, 240, 210, 20);
		frame.getContentPane().add(textField);

		lblChechNumber = new JLabel("Chech Number :");
		lblChechNumber.setBounds(209, 235, 140, 30);
		frame.getContentPane().add(lblChechNumber);

		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(524, 336, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);


		rdbtnNewRadioButton = new JRadioButton("CASH");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtnNewRadioButton.setBackground(new Color(128, 0, 128));
		rdbtnNewRadioButton.setBounds(91, 166, 109, 30);
		rdbtnNewRadioButton.setBorder(border);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChechNumber.setVisible(false);
				textField.setVisible(false);

			}
		});
		panel.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("CHECK");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(128, 0, 128));
		rdbtnNewRadioButton_1.setBounds(91, 207, 109, 30);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChechNumber.setVisible(true);
				textField.setVisible(true);

			}
		});
		panel.add(rdbtnNewRadioButton_1);

		lblChechNumber.setVisible(false);
		textField.setVisible(false);


		ButtonGroup bp=new ButtonGroup();
		bp.add(rdbtnNewRadioButton);
		bp.add(rdbtnNewRadioButton_1);


		frame.setVisible(true);

	}
}
