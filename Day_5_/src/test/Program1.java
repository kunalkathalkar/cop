package test;

import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	Date(){
		this.day=1;
		this.month=2;
		this.year=2021;
	}
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
}

public class Program1 {
	static Scanner sc=new Scanner(System.in);
	public static void setData(Date d) {
		System.out.println("Enter Day");
		d.setDay(sc.nextInt());
		System.out.println("Enter Month");
		d.setMonth(sc.nextInt());
		System.out.println("Enter Year");
		d.setYear(sc.nextInt());
		sc.close();
	}
	
	public static void showData(Date d) {
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
	}

	public static void main(String[] args) {
		
		Date d=new Date();
		Program1.setData(d);
		Program1.showData(d);
		Date d1=new Date();
		Program1.showData(d1);
		Date d2=new Date(2,2,2021);
		Program1.showData(d2);
		
	}

}
