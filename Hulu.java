package huluDemo;
import java.time.LocalDate;


public class Hulu {
	private String emailAddress;
	private String name;
	private String password;
	public enum Gender {Male, Female, Other}
	private Gender gender;
	private LocalDate DOB; 

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		if (!emailAddress.matches("^[a-zA-Z0-9+-._]+@+[a-zA-Z0-9.-]+$")) {
			System.out.println(emailAddress + " is not a valid email.");
			return;
		}
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (!password.matches("((?=.*[a-z])(?=.*\\d)(?=.*[@#$%!])(?=.*[A-Z]).{6,16})")) {
			System.out.println(password + " is not an valid password");
			System.out.println("password must have atleast one lowercase letter,one digit and one special character, \n");
			return;
		}
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (!validateName(name)) {
			System.out.println(name + " is not a valid name.");
			System.out.println("Please enter a valid name.");
			return;
		}
		this.name = name;
	}
	private boolean validateName(String name2) {
		// TODO Auto-generated method stub
		return name2.matches("^[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender Gender) {
		this.gender = Gender;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}
	
	public Hulu(String emailAddress, String Password, String Name, Gender Gender, LocalDate DOB ) {
		super();
		this.emailAddress = emailAddress;
		this.password = Password;
		this.name = Name;
		this.gender = Gender;
		this.DOB = DOB;
	}
}