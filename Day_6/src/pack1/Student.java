package pack1;

import java.util.Scanner;

public class Student {
	private int roll_no;
	private String name;
	private char grade;
	private int totalmarks;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll No :");
		roll_no=sc.nextInt();
		System.out.println("Name :");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Grade :");
		grade=sc.next().charAt(0);
		System.out.println("Total Marks :");
		totalmarks=sc.nextInt();
		
}
	
	public void display() {
		System.out.println(roll_no+" "+name+" "+grade+" "+totalmarks);
	}
	

}
