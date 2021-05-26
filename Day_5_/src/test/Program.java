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
	
	public static void compare(Employee[] arr) {
		for(int i=0;i<5;i++) {
			if(arr[i].salary>20000.00)
				System.out.println("Employee with salary more than 20000 is  :"+arr[i].name);
		}
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
		
//		System.out.println("Name :"+emp.getEmpid());
//		System.out.println("Name :"+emp.getName());
//		System.out.println("Name :"+emp.getAddress());
//		System.out.println("Name :"+emp.getSalary());
		Employee[] arr=new Employee[5];
		System.out.println("Enter employee information");
		for(int i=0;i<5;i++) {
			Employee emp=new Employee();
			arr[i]=emp;
					
		}
        for(Employee arrs:arr) {
        	System.out.print( arrs.getEmpid()+" \n "+ arrs.getName()+" "+ arrs.getAddress()+" "+ arrs.getSalary());
        }
        
        System.out.println();
   
        Employee.compare(arr);
        
	}

}
