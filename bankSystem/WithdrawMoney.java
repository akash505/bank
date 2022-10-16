package bankSystem;



import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import javax.swing.*;

public class WithdrawMoney{
	private static JFrame frame;
	private static JLabel Heading,label1,label2,label3,label4,label6,label7;
	static JTextField amount,confirmpassword;
	static JPasswordField password;
	static JPanel panel;
	static JButton btn1,Home,btn4;
	
	static String Password,Confirm,Amount;
	private static JLabel lblNewLabel_1;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Password=Credentials.getPass();

		frame =new JFrame();
		label1=new JLabel("Current Balance :");
		label1.setBounds(209,77,110,30);
		label2=new JLabel("Enter Amount :");
		label2.setBounds(209,115,110,30);
		label3 = new JLabel(String.valueOf(Credentials.getamount()));
		label3.setBounds(360,84,200,20);
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
		btn1.setBounds(490,230,80,20);
		btn1.addActionListener(new ActionListener () {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String text=amount.getText();
				if(password.getText().equalsIgnoreCase(Password)&& confirmpassword.getText().equalsIgnoreCase(Password)) {
					if(!Pattern.matches("[0-9]+(.([0-9]+)?){1}+",text)) {
						JOptionPane.showMessageDialog(null, "Enter Valid Amount","Message",JOptionPane.WARNING_MESSAGE);
					}else {
						Balanceinfo.withdraw();
						frame.dispose();
//						Transactioncheckdata.main(args);
						WithdrawMoney.main(args);
					}

				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect Password","Password",JOptionPane.WARNING_MESSAGE);
				}


			}
		});

		panel=new JPanel();
		panel.setBounds(1,1,200,370);
		panel.setLayout(null);
		panel.setBackground(new Color(139, 0, 139));

		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label3);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(password);
		frame.getContentPane().add(label6);
		frame.getContentPane().add(label7);
		frame.getContentPane().add(confirmpassword);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("WITHDRAW");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 32));
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
		frame.setVisible(true);
	}
}
