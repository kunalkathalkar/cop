package test;

import java.util.Scanner;

public class Test {

	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle");
		double principle=sc.nextDouble();
		System.out.println("Enter the Rate");
		double rate=sc.nextDouble()/100;
		System.out.println("Enter the No of Years");
		double years=sc.nextDouble();
		System.out.println("Enter the n");
		int n= sc.nextInt();
		double amount=  principle * Math.pow(1+(rate/n),years*n);
		
		double com_interest = amount - principle;
		System.out.println("compound interest is :"+com_interest);
	}
	
	
	public static void main2(String[] args) {
		int num1=5,num2=2;
		char ch1='a',ch2='b';
		System.out.println("Addition is :"+(num1+num2));
		System.out.println("Addition is :"+((String.valueOf(ch1))+(String.valueOf(ch2))));
		
	}
	
	
	
	
    public static void main1(String[] args) {
	   System.out.println("Hello World");
}
	

}
