package test;

import java.util.*;

class Customer{
	private String name;
	private String emailid;
	private int age;
	private double creditlimit;
	public Customer() {
		this("Riya","riya@gmail.com",25,10000);
	}
	public Customer(String name, String emailid, int age, double creditlimit) {
		
		this.name = name;
		this.emailid = emailid;
		this.age = age;
		this.creditlimit = creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public void getXDetails() {
		System.out.println("Name : "+name+ " Emailid : "+emailid+"Age : "+age+" Creditlimit :"+creditlimit);
	}
	
	public String toString() {
		return name+" "+creditlimit;
	}
}
class Customer1{
	private String name;
	private String emailid;
	private int age;
	private double creditlimit;
	public Customer1() {
		this("tina","tina@gmail.com",15,8000);
	}
	public Customer1(String name, String emailid, int age, double creditlimit) {
		
		this.name = name;
		this.emailid = emailid;
		this.age = age;
		this.creditlimit = creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public void getXDetails() {
		System.out.println("Name : "+name+ " Emailid : "+emailid+"Age : "+age+" Creditlimit :"+creditlimit);
	}
	

}

public class Program {

	public static void main(String[] args) {
		String name;
		String emailid;
		int age;
		double creditlimit;
		Scanner sc=new Scanner(System.in);
//		Random rand=new Random();
//		System.out.println("Enter the values to be set in parameterized constructor");
//		System.out.println("Enter 1.Name :");
//		name=sc.nextLine();
//		System.out.println("Enter 2.Emailid");
//		emailid=sc.nextLine();
//		System.out.println("Enter 3.Age");
//		age=sc.nextInt();
//		System.out.println("Enter 4.Creditlimit");
//		creditlimit=sc.nextDouble();
//		
//		Customer c=new Customer(name,emailid,age,creditlimit);
//		System.out.println(c.toString());
		Customer c1=new Customer();
		c1.getXDetails();
		System.out.println("Enter the creditlimit to be set");
		c1.setCreditlimit(sc.nextDouble());
		System.out.println("Updated creditlimit is :"+c1.getCreditlimit());
		c1.getXDetails();
		System.out.println();
		Customer1 c=new Customer1();
		c.getXDetails();
		System.out.println("Enter the creditlimit to be set");
		c.setCreditlimit(sc.nextDouble());
		System.out.println("Updated creditlimit is :"+c.getCreditlimit());
		c.getXDetails();

	}

}
