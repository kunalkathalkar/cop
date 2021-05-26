package test;

import java.util.Scanner;

public class Test1 {
    
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		int result=1;
		for(;exponent!=0;exponent--)
			result=result*base;
		System.out.println("result "+result);

	}

}
