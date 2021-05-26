package test;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private String address;
	private double salary;
	static Scanner sc=new Scanner(System.in);
	public Employee() {
		System.out.println("Empid :");
		this.setEmpid(sc.nextInt());
		System.out.println("Name :");
		sc.nextLine();
		this.setName(sc.nextLine());
		System.out.println("Address :");
		this.setAddress(sc.nextLine());
		System.out.println("Salary :");
		this.setSalary(sc.nextDouble());
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
}

public class Program {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println("Name :"+emp.getEmpid());
		System.out.println("Name :"+emp.getName());
		System.out.println("Name :"+emp.getAddress());
		System.out.println("Name :"+emp.getSalary());

	}

}
