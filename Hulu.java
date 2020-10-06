package huluDemo;

public class Hulu {
	private String emailAddress;
	private String Name;
	private String Password;
	private String Gender;
	private String DOB; 

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return Password;
	}
	public void setLastName(String Password) {
		this.Password = Password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public Hulu(String emailAddress, String Password, String Name, String Gender, String DOB ) {
		super();
		this.emailAddress = emailAddress;
		this.Password = Password;
		this.Name = Name;
		this.Gender = Gender;
		this.DOB = DOB;
	}
}
