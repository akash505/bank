package bankSystem;


import java.sql.*;


public class Transactioncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String a="a"+Credentials.getAccount(); 


		try { 

			String query="select * from "+a+";";
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HNBank","root", "root");

			Statement st=con.createStatement();
			@SuppressWarnings("unused")
			ResultSet r1=st.executeQuery(query);
//			ResultSet r2=st.executeQuery(query1);
			
			System.out.println(" records inserted");
			con.close();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}





	}

}
