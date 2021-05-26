package test;

import java.util.Scanner;

public class Test2 {
	public static void main14(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of num1, num2 and num3");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println("Num1 "+num1+" is greatest");
		if(num2>num1 && num2>num3)
			System.out.println("Num2 "+num2+" is greatest");
		if(num3>num1 && num3>num2)
			System.out.println("Num3 "+num3+" is greatest");
	
	
	}
	
	public static void main13(String[] args) {
		 int c=0,a,temp; 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number ");
		    int n=sc.nextInt();
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");  
		    sc.close();
		   }  
	
	
	public static void main12(String[] args) {
      int i,count;
      System.out.print("Enter n value : ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(i=1;i<=j;i++)
        	{
        	if(j%i==0)
        	{
        	     count++;        
        	}
        	}
        	if(count==2)
        	    System.out.print(j+"  ");     
        	}
      }
	
	
	
	public static void main11(String[] args) {
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter any Number : ");
		int num=sc.nextInt();
		while(num!=0) {
			int temp=num%10;
			result= result*10+temp;
			num=num/10;
		}
		System.out.println("Reverse of a Number is :"+result);	
	}
	
	
	public static void main10(String[] args) {
	int number, i, evenSum = 0, oddSum = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Please Enter any Number : ");
	number = sc.nextInt();	
	
	for(i = 1; i <= number; i++)
	{
		if(i % 2 == 0)
		{
			evenSum = evenSum + i; 
		}
		else
		{
			oddSum = oddSum + i;
		}
	}
	System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
	
	
	public static void main9(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt(); 
		 int reversedNum = 0, remainder;
		 int originalNum = num;
		    
		 while (num != 0) {
		      remainder = num % 10;
		      reversedNum = reversedNum * 10 + remainder;
		      num /= 10;
		    }
		    
		    
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
		  }

	
	
	
	
	
	public static void main8(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int num=sc.nextInt();
		  int sum = 0; 
		  for(int i=1;i<=num;i++) { 
		      sum = sum + i ; 
		   } 
		   System.out.println("Sum is "+sum); 
		  } 

	
	
	
	
	
	
	public static void main7(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean t_rue=true;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++) {
			int temp=num%i;
			if(temp==0) {
				t_rue=false;
				break;
				}
		}
		if(t_rue)
		System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}






	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=1;
		while(num!=0) {
			result=result*num;
			num--;
		}
		System.out.println("Factorial of a numner is :"+result);
	}


	public static void main5(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("swapped numbers are");
		System.out.println("Num1 :"+num1);
		System.out.println("Num2 :"+num2);
	}

}
