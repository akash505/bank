package bankSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CHpassword{
	protected static final String[] args = null;
	JFrame frame;
	static JTextField textField_1;
	private JTextField textField_2;
	/* String[] gender={"Male","Female"}; */


	CHpassword()
	{
		createWindow();

	}
	public void createWindow()
	{
		frame=new JFrame();

		frame.setBounds(40,40,592,381);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 187, 354);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("ForgotPassword");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 33, 167, 34);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_5_2 = new JLabel("Account Number :");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(197, 75, 129, 17);
		frame.getContentPane().add(lblNewLabel_5_2);

		JLabel lblNewLabel_1 = new JLabel("HN BANK");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1.setBounds(328, 11, 138, 34);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(348, 73, 210, 20);
		frame.getContentPane().add(textField_1);



		JLabel lblNewLabel_5_2_1 = new JLabel("Account Holder Name:");
		lblNewLabel_5_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5_2_1.setBounds(197, 121, 151, 17);
		frame.getContentPane().add(lblNewLabel_5_2_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(348, 119, 210, 20);
		frame.getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(469, 162, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Accountnumber=textField_1.getText();
				String Holdername=textField_2.getText();
//				String email =textField.getText();

//				if(email.isEmpty()) {
//					JOptionPane.showMessageDialog(null,"Enter email","Bank", JOptionPane.WARNING_MESSAGE);	
//				}				
				if(Accountnumber.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Enter Account Number","Bank", JOptionPane.WARNING_MESSAGE);								
				}
				else if(Holdername.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Enter Account Holder Name","Bank", JOptionPane.WARNING_MESSAGE);
				}
//				else if(!Pattern.matches("[A-Za-z]+[0-9]+@[A-Za-z-_]+(?:\\.[com]+){1}+",email)) {
//					JOptionPane.showMessageDialog(null,"Invalid type in Email","Bank", JOptionPane.WARNING_MESSAGE);
//				}
				else if(!Pattern.matches("[0-9]{12}",Accountnumber)) {
					JOptionPane.showMessageDialog(null,"Invalid Input "+"\n"+"Check Account Number","Bank", JOptionPane.WARNING_MESSAGE);
				}
				else {
//					ChangePasswordController.checkAccount(Accountnumber, Holdername);
					CHpassworddatabase.checkAccount(Accountnumber, Holdername);

				}
			}

		});


		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(348, 162, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterLogin.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_2);


		frame.setVisible(true);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}



	//    @Override
	//    public void actionPerformed(ActionEvent e) {
	// 
	//    }
	public static void main(String[] args)
	{
		new CHpassword();
	}
}