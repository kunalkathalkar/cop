package test;

import java.util.Scanner;

class Date{        
    private static Scanner sc=new Scanner(System.in);               
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void acceptRecord() {
		System.out.println("Enter Day :");
		this.day=sc.nextInt();
		System.out.println("Enter Month :");
		this.month=sc.nextInt();
		System.out.println("Enter Year :");
		this.year=sc.nextInt();
		sc.close();
	}
	
	public void displayRecord() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	
	
}
public class Program {

	public static void main1(String[] args) {
		Date date=new Date();
		date.acceptRecord();
		date.displayRecord();
	}

}
