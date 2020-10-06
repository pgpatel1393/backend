package huluDemo;

public class HuluApp {public static void main(String[] args) {
	// TODO Auto-generated method stub
	HuluDAO customerList = new HuluDAO();
	Hulu user1 = new Hulu("parth@parth.com", "parth123","Parth","Male","01/13/1993");
	Hulu user2 = new Hulu("mruga@mruga.com", "mruga123","Mruga","Female","01/13/1993");
	Hulu user3 = new Hulu("moksh@moksh.com", "moksh123","Moksh","Male","01/13/1993");

	
	customerList.addCustomer(user1);
	customerList.addCustomer(user3);
	customerList.deleteCustomer(user2);
	customerList.printCustomers();		
}

}
