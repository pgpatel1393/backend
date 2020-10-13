package huluDemo;

import huluDemo.Hulu.Gender;

import java.time.LocalDate;
import java.util.*;


public class HuluApp {public static void main(String[] args) {
	
	Hulu customer = new Hulu(null, null, null, null, null);
	Scanner sc= new Scanner(System.in);
	
	addEmailAddress(customer, sc);
	addPassword(customer, sc);
	addName(customer,sc);
	addGender(customer,sc);
	addDOB(customer,sc);
	
	HuluDAO customers= new HuluDAO();
	customers.addCustomer(customer);
	
	}
private static void addEmailAddress(Hulu customer, Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Please enter your Email Address:");
	while(true) {
		String str = sc.next();
		customer.setEmailAddress(str);
		if(str.equals(customer.getEmailAddress())) {
			break;
		}
		System.out.println("Please enter valid Email address");
	}
	System.out.println();
}
private static void addPassword(Hulu customer, Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Please enter your Password:");
	while (true) {
		String str = sc.next();
		customer.setPassword(str);
		if (str.equals(customer.getPassword())) {
			break;
		}
		System.out.println("Please enter valid Password");
	}
	System.out.println();
}
private static void addName(Hulu customer, Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Please enter your Name:");
	while (true) {
		String str = sc.next();
		customer.setName(str);
		if (str.toLowerCase().equals(customer.getName())) {
			break;
		}
		System.out.println("Please enter a valid first name: ");
	}
	System.out.println();
}
private static void addGender(Hulu customer, Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Please choose a gender: ");
	System.out.println("1-Male, 2-Female, 3-Others \n");
	
	int gender = sc.nextInt();
	while (gender != 1 && gender != 2 && gender != 3) {
		System.out.println("Please choose a valid number");
		System.out.println("1-Male, 2-Female, 3-Others");
		gender = sc.nextInt();
	}
	if (gender == 1) {
		customer.setGender(Gender.Male);
	}
	if (gender == 2) {
		customer.setGender(Gender.Female);
	}
	if (gender == 3) {
		customer.setGender(Gender.Other);
	}
}
//we can use switch case here as well

private static void addDOB(Hulu customer, Scanner sc) {
	// TODO Auto-generated method stub
	int year = 0, month = 0, day = 0;
	System.out.println("Please enter your birth year: ");
	year = sc.nextInt();
	while (year < 1900 || year > 2020) {
		System.out.println("Please enter valid year:");
		year = sc.nextInt();
	}
	System.out.println("Please enter your birth month: ");
	month = sc.nextInt();
	while (month < 1 || month > 12) {
		System.out.println("please enter valid month:");
		month = sc.nextInt();
	}
	System.out.println("Please enter your birth day: ");
	day = sc.nextInt();
	while (day < 1 || day > 31) {
		System.out.println("please enter valid date:");
		day = sc.nextInt();
	}
	
	LocalDate DOB = LocalDate.of(year, month, month);
	customer.setDOB(DOB);
	}
}
