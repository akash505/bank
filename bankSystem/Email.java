package bankSystem;


import java.awt.Component;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class Email {  
	private static final Component frame = null;
	private static String to;
	static long random1;
	static String Password;
	static String Pass;

	public static void main(String[] args) {  


	 	//Get the session object  

		Properties props = new Properties();  
		System.out.println("start");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");   
		props.put("mail.smtp.port","587");

		String user="akashpanwar18228@gmail.com";//change accordingly  
		String password="7906627328";//change accordingly 


		to="herocool1234@gmail.com";

		Session session = Session.getDefaultInstance(props,new Authenticator() {  

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {  
				System.out.println("Close");
				JOptionPane.showMessageDialog(null,"Processing");
				return new PasswordAuthentication(user,password);  
			}  
		});  
		Message message=prepareMessage(session,user);

	}

	public static Message prepareMessage(Session session, String user) {
		try {
			Message message=new MimeMessage(session);
			System.out.println("Ok");
			message.setFrom(new InternetAddress(user));
			System.out.println("Ok");
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to)); 
			JOptionPane.showMessageDialog(null,"Message");
			message.setSubject("Text"); 
			random1=(long)(Math.random()*100);

			Password=String.valueOf((random1)*512);

			message.setText("Your OTP Number :"+Password);
			String email=Credentials.setEmail(Password);  
			System.out.println(Password);
			Transport.send(message);
			JOptionPane.showMessageDialog(null,"OTP Send");
			System.out.println("sent");


			String as=Credentials.getEmail();
			String otp=JOptionPane.showInputDialog(frame,"Enter OTP Number","Bank", JOptionPane.PLAIN_MESSAGE);

			if(!Pattern.matches("[0-9]+",otp)) {
				JOptionPane.showMessageDialog(null,"Check Input only in numeric form","Bank", JOptionPane.WARNING_MESSAGE);
			}else {
				System.out.print("work");
				if(otp.equals(as)) {					
					Pass=JOptionPane.showInputDialog(frame,"Enter New Password Only in Numeric form Starts with '1'","Bank", JOptionPane.PLAIN_MESSAGE);
					ChangePasswordController.InputPassword();
					System.out.print("work1");
					}
				System.out.print("work2");
			}


		}catch(Exception ex){ 
			Logger.getLogger(Email.class.getName()).log(Level.SEVERE,null,ex);
			JOptionPane.showMessageDialog(null, "Check Your Connection","Connection error", JOptionPane.ERROR_MESSAGE);
		}

		return null;

	}  

}
