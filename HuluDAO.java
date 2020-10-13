package huluDemo;

import java.util.ArrayList;

public class HuluDAO {
private ArrayList<Hulu> customerList = new ArrayList<>();
	
	public void addCustomer(Hulu customer) {
		customerList.add(customer);
	}
	
	private Hulu findCustomer(String email) {
		// TODO Auto-generated method stub=
		
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getEmailAddress().equals(email)) {
				printCustomers(customerList.get(i));
				return customerList.get(i);
			}
		}
		System.out.println("User does not exist");
		return null;
	}
	
	public void printCustomers(Hulu hulu) {
		for (Hulu customer : customerList)
		System.out.println(customer.getEmailAddress() + " " + customer.getPassword()+" " + customer.getName()+" " + customer.getGender()+" " + customer.getDOB());
	}
}