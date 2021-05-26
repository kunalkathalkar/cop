package test;

import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Pen");
		System.out.println("2. Pencil ");
		System.out.println("3. NoteBook ");
		System.out.println("4. Bottle ");
		System.out.println("5. ColorBox ");
		
		
		do {
			System.out.println("Enter the choice");
			 choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the no of pens to be purchased");
				System.out.println("Total :"+(float)(sc.nextInt()*10)+"Rs");
				break;
			case 2:
				System.out.println("Enter the no of Pencil to be purchased");
				System.out.println("Total :"+(float)(sc.nextInt()*5)+"Rs");
				break;
			case 3:
				System.out.println("Enter the no of NoteBook to be purchased");
				System.out.println("Total :"+(float)(sc.nextInt()*20)+"Rs");
				break;
			case 4:
				System.out.println("Enter the no of Bottle to be purchased");
				System.out.println("Total :"+(float)(sc.nextInt()*30)+"Rs" );
				break;
			case 5:
				System.out.println("Enter the no of ColorBox to be purchased");
				System.out.println("Total :"+(float)(sc.nextInt()*50)+"Rs" );
				break;
				
			}
		}while(choice!=0);
		
	}
	
	
	
	public static void main10(String[] args) {
		double salary;
		double hra,da;
		System.out.println("Enter the salary");
		salary=sc.nextInt();
		
		if(salary<= 10000) {
			System.out.println("Enter hra :");
			hra=sc.nextDouble()/100;
			System.out.println("Enter da :");
			da=sc.nextDouble()/100;
			double grosssalary=salary+hra*salary+da*salary;
			System.out.println("Actual Salary is :"+grosssalary);
			
		}
		
		else if(salary<= 20000) {
			System.out.println("Enter hra :");
			hra=sc.nextDouble()/100;
			System.out.println("Enter da :");
			da=sc.nextDouble()/100;
			double grosssalary=salary+hra*salary+da*salary;
			System.out.println("Actual Salary is :"+grosssalary);
			
		}
		
		else {
			System.out.println("Enter hra :");
			hra=sc.nextDouble()/100;
			System.out.println("Enter da :");
			da=sc.nextDouble()/100;
			double grosssalary=salary+hra*salary+da*salary;
			System.out.println("Actual Salary is :"+grosssalary);
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main9(String[] args) {
		int sum=0;
		int array[] = new int[5];
		 for(int i=0;i<5;i++) {
			 System.out.println("Enter the arry Element "+(i+1));
			 array[i]=sc.nextInt();
			  sum=sum+array[i];
		 }
		 System.out.println("total sum is :"+sum);
		 
		 double avg=sum/5;
		 System.out.println("Average is :"+avg);
		 
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	  }
	 
	  
	  public static int getMax1(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  
	  public static int getMin1(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	


	
	
	
	
	
	
	
	public static void main8(String[] args) {
		int array[] = new int[5];
		 for(int i=0;i<5;i++) {
			 System.out.println("Enter the arry Element "+(i+1));
			 array[i]=sc.nextInt();
		 }
	    
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	  }
	 
	  
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	
	
	
	
	
	
	
	
	public static int findIndex(int[] arr,int num) {
		int i=0;
		for(i=0;i<arr.length;i++) {
		if(arr[i]==num) {
           return i;
          }
	}
		return -1;
}
			
	public static void main7(String[] args) {
		int index=0;
		int[] arr = new int[5];
		System.out.println("Enter the arry Elements");
		for(index=0;index<=4;index++) {
			System.out.println("Enter the arry Element "+(index+1));
			arr[index]=sc.nextInt();
		}
		
		System.out.println("Array Elements are :");
		for(int arrs:arr) {
			System.out.println(arrs);
		}
		
		System.out.println("Enter the number whose index is to be found if present");
		int num=sc.nextInt();
		
		int temp= Program.findIndex(arr, num);
		if(temp>=0 && temp<=4)
			System.out.println("Index of a Number is :"+temp);
		else
			System.out.println("Number does not exist in Array");
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main6(String[] args) {
		  int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");    
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        } 
	}
	
	
	
	
	 
	public static void main5(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<=4;i++) {
			System.out.println("Enter the Number"+(i+1)+"");
			arr[i]=sc.nextInt();
		}
		for(int arrs:arr) {
			System.out.println(arrs);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static Scanner s=new Scanner(System.in);
	
	 static void sum() {
		    System.out.println("Enter a value");
			int a=s.nextInt();
			System.out.println("Enter b value");
			int b=s.nextInt();
			int result=a+b;
			System.out.println("Result :"+result);
			s.close();
		}
	 void sum(int a,int b) {
			
		    System.out.println("Result :"+(a+b));
		}
		static double sum(int a,double b) {
			return a+b;
		}
		static float sum(int a,float b) {
			return a+b;
		}
   
     public static void main4(String[] args) {
    	 
		Program.sum();
		System.out.println("Result :"+Program.sum(8, 8.888));
		System.out.println("Result :"+Program.sum(8, 5.5f));
  
}
     
     public static void arraySwap(int arr[],int i,int j) {
    	 int temp=arr[i];
    	 arr[i]=arr[j];
    	 arr[j]=temp;
     }
	public static void main3(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};  
	     System.out.println("Original array: ");  
	     for (int i = 0; i < arr.length; i++) {  
	         System.out.print(arr[i] + " ");  
	     } 
	     System.out.println();
	     
	      Program.arraySwap(arr,1,2);
	      
	     System.out.println("Array elements after swap ");
	     for(int arr1:arr) {
	    	 System.out.print(arr1+" ");
	     }
	}
     
	
	
	
	
	
    public static Scanner sc=new Scanner(System.in);
	public static void main2(String[] args) {
		int total=0;double avg;
		int[] marks=new int[5];
		
		for(int i=0 ;i<=4;i++) {
			System.out.print("Enter Marks of Subject"+(i+1)+":");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		sc.close();
		avg=total/5;
		 System.out.print("The student Grade is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=60 && avg<80)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=40 && avg<60)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
		
		
}
	
	
	
	
	
	

	public static void main1(String[] args) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
             }
			System.out.println("");
		}
		
	}

}