package test;

import java.util.Scanner;

class TestCustomer {
	
	private String name;
	private String emailId;
	private int age;
	private double creditLimit;
	
	public void acceptInfo() {
	Scanner sc=new Scanner(System.in);	
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
public class Program3 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	     TestCustomer t1=new TestCustomer();
	     System.out.println("Enter First Customer Details : ");
	     t1.acceptInfo();
	     System.out.println("Enter Second Customer Details : ");
	     TestCustomer t2=new TestCustomer();
	     t2.acceptInfo();
	     System.out.println("Display First Customer Details : ");
	     t1.showDetails();
	     System.out.println("Display Second Customer Details : ");
	     t2.showDetails();
	     System.out.println("Set new Credit Limit of Custoner 2 Enter new value :");
	     t2.setCreditLimit(s.nextDouble());
	     System.out.println("Updated Credit Limit is :"+t2.getCreditLimit());
	    		 
	     
	}

}
