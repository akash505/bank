package bankSystem;


import java.awt.Component;
import java.util.regex.Pattern;

//import java.util.regex.*;
import javax.swing.JOptionPane;

public class Balanceinfo {
	static float balance=Credentials.getamount();
//	static float balance=0;
	static String show;
	private static String[] args;
	
	static public void withdraw() {
		if(balance<Float.parseFloat(WithdrawMoney.amount.getText())) {
			JOptionPane.showMessageDialog(null,
					"Balance is insufficient to M Withdraw "+balance);
			
			System.out.println(balance);

		} else { 
			
			balance=balance-Float.parseFloat(WithdrawMoney.amount.getText());
			
			JOptionPane.showMessageDialog(null,
					"Current Balance After Withdraw"+balance);
			show="Withdraw";
			
			System.out.println(balance-Float.parseFloat(WithdrawMoney.amount.getText()));
			Transactioncheckdata.main(args);

			
			System.out.println(balance);}

	}



	static public void Deposite() {
		balance=balance+Float.parseFloat(AddMoney.amount.getText());
		JOptionPane.showMessageDialog(null, "Amount after Deposit"+balance); 
		show="Deposit";
		Transactioncheckdata.main(args);
		System.out.println(balance);}


	static public void Transfer(Component frame){
		String Pass=JOptionPane.showInputDialog(frame,"Enter Amount","Bank", JOptionPane.PLAIN_MESSAGE);
		if(!Pattern.matches("[0-9]+(.([0-9]+)?){1}+",Pass)) {
			JOptionPane.showMessageDialog(null, "Enter a Valid Amount","Bank", JOptionPane.WARNING_MESSAGE); 
		}
		else if(balance<Float.parseFloat(Pass)) {
			JOptionPane.showMessageDialog(null,
					"Balance is insufficient  "+balance);

			System.out.println(balance);

		}
		else { 
			
			balance=balance-Float.parseFloat(Pass);
			JOptionPane.showMessageDialog(null, 
					"Current Balance After Transfer"+balance);
			show="Transfer";
			Transactioncheckdata.main(args);
			System.out.println(show);
			}

	}
}
