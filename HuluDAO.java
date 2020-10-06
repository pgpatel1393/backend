package huluDemo;

import java.util.ArrayList;

public class HuluDAO {
private ArrayList<Hulu> customerList = new ArrayList<>();
	
	public void addCustomer(Hulu customer) {
		customerList.add(customer);
	}
	public void addCustomer(String Name) {
		for (Hulu customer : customerList) 
		{
			System.out.println(customer.getName());
		}	
	}
	public void deleteCustomer(Hulu customer) {
		// TODO Auto-generated method stub
	}
	public void printCustomers() {
		for (Hulu customer : customerList)
		System.out.println(customer.getEmailAddress() + " " + customer.getPassword()+" " + customer.getName()+" " + customer.getGender()+" " + customer.getDOB());
	}
}