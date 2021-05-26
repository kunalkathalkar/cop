package test;

import java.util.Scanner;

class Employee{
	private static Scanner sc=new Scanner(System.in);
	private String empid;
	private String name;
	private double salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double net_salary;
	private double gross_salary;
	Employee(){
		
	}
	public void acceptEmployeeDetails() {
		System.out.println("Enter Employee ID :");
		this.name=sc.nextLine();
		System.out.println("Enter Employee Name :");
		this.empid=sc.nextLine();
		System.out.println("Enter Employee Salary :");
		this.salary=sc.nextDouble();
		
	}
	
	public void calculate() {
		pt=200;
		hra = 50*salary/100;
		pf = 12*salary/100;
		System.out.println("Enter Medical");
		medical=sc.nextDouble();
		gross_salary = salary + hra + medical;
		net_salary=gross_salary-(pt+pf);
		
		}
	public void displayEmployeeDetails() {
		System.out.println("Employee Details are :");
		System.out.println("Employee ID :"+this.empid);
		System.out.println("Name :"+this.name);
		System.out.println("Basic Salary :"+this.salary);
		System.out.println("Gross Salary :"+this.gross_salary);
		System.out.println("Net Salary :"+this.net_salary);
	}
	
	}
	
	


public class Program4 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.acceptEmployeeDetails();
		emp.calculate();
		emp.displayEmployeeDetails();

	}

}
