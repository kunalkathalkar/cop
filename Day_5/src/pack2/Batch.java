package pack2;

import java.util.Scanner;

public class Batch {
	private int batch_no;
	private int batch_year;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Batch No :");
		batch_no=sc.nextInt();
		System.out.println("Batch Year :");
		batch_year=sc.nextInt();
	}
	
	public void display() {
		System.out.println(batch_no+" "+batch_year);
	}
}
