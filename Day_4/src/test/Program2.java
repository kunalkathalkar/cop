package test;

import java.util.Scanner;

class Customer{
	static Scanner sc=new Scanner(System.in);
	private String name;
	private String emailId;
	private int age;
	private double creditLimit;
	
	public void acceptInfo() {
	System.out.println("Enter Customer Name :");
	this.name=sc.nextLine();
	System.out.println("Enter Customer EmailId :");
	this.emailId=sc.nextLine();
	System.out.println("Enter Customer Age :");
	this.age=sc.nextInt();
	System.out.println("Enter Customer Credit Limit :");
	this.creditLimit=sc.nextDouble();
	}
	
	public void showDetails() {
		System.out.println("Customer Name :"+this.name);
		System.out.println("Customer Credit Limit :"+this.creditLimit);
	
}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
}

public class Program2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer customer=new Customer();
		customer.acceptInfo();
		customer.showDetails();
		System.out.println("Set new Credit Limit Enter new value :");
		customer.setCreditLimit(s.nextDouble());
		System.out.println("Updated Credit Limit is :"+customer.getCreditLimit());
		

	}

}
