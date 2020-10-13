package huluDemo;

import java.sql.*;
import java.time.LocalDate;
import huluDemo.Hulu.Gender;

public class HuluDAOSQL {
	
	private static final String TABLE = "customerlist";
	
	public static void main(String[] args) {

		addCustomer("hari@hari.com", 
	            "12345678", 
	            "Hari",
	            Gender.Male, 
	            LocalDate.of(1993, 05, 05));
		deleteCustomer("mruga@gmail.com");
	}	
	//Add a customer
	public static void addCustomer(String email, 
					    String password, 
					    String Name, 
					    Gender gender,
					    LocalDate birthday) {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hulu", "root", "");
		    Statement statement = c.createStatement();
		  
		    	Hulu customerlist = new Hulu(email, password, Name, gender, birthday);
					
			// Add a new user
		    	String info = String.format("hari@hari.com", "12345678", "Hari", Gender.Male, LocalDate.of(1993, 05, 05), TABLE);
	
			statement.executeUpdate(info);			
			statement.close();
		}
			catch (Exception exc) {
			// TODO Auto-generated catch block
			exc.printStackTrace();
		}	
	}
	// Delete a customer
		private static void deleteCustomer(String email) {
			// TODO Auto-generated method stub
	try {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hulu", "root", "");
	    Statement statement = c.createStatement();
	  
	    	Hulu Customerlist = new Hulu(email, null, null, null, null);
				
		// Add new user to user table 
	    	String info = String.format("keena@keena.com", "1234567", "Keena", Gender.Female, LocalDate.of(1993, 04, 04), TABLE);

		statement.executeUpdate(info);			
		statement.close();
	}
		catch (Exception exc) {
		// TODO Auto-generated catch block
			System.out.println("Customer not found");
		exc.printStackTrace();
	}	
		}
	
}