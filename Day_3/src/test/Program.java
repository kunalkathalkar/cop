package test;


import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		int i;
		char[] arr=new char[5];
		System.out.println("Enter the character array elements :");
		  for(i=0;i<arr.length;i++) {
			  arr[i]=sc.next().charAt(0);
		  }
		  for( i=0;i<arr.length;i++) {
				 System.out.print(" arr["+i+"] :" + arr[i]);
	}
		  System.out.println();
		  System.out.println("Converted charater elements to string are :");
		  String str=String.valueOf(arr);
	      System.out.println(str);
	      
	      
	}
	
	
	 public static void main6(String[] args) {
		 int temp=0;
		int[] arr=new int[5];
		System.out.println("Enter arry elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" arr["+i+"] :"+arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("Sorted elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" arr["+i+"] :"+arr[i]);
			
		}
	}
	
	
	
	
	
	
	     public static void main5(String[] args) {
	    	 int i,j;
			int[] arr1= new int[]{1,2,3};
			System.out.println("First array elemets are :");
			for(int arr:arr1)
				System.out.print(arr+" ");
			System.out.println();
			int[] arr2=new int[] {4,5,6};
			System.out.println("Second array elemets are :");
			for(int arr:arr2)
				System.out.print(arr+" ");
			System.out.println();
			int[] arr3=new int[arr1.length + arr2.length];
		    System.out.println("Storing the elements of arr1 to arr3");
	         for(i=0;i<arr1.length;i++) {
	        	 arr3[i]=arr1[i];
	         }
	         System.out.println("Storing the elements of arr2 to arr3"); 
	         for(i=0;i<arr1.length;i++) {
	        	 arr3[arr1.length+i]=arr2[i];
	         }
	         
	         System.out.println("the elements of resultant array after merging are :");
	         for(int arr:arr3) {
	        	 System.out.print(arr+" ");
	         }
	     } 
	
	     public static void sumFunction(int...a) {
	    	 int sum=0;
	    	 for(int i=0;i<a.length;i++){
	    		 sum=sum+a[i];
	    	 }
	    	 System.out.println("Sum is :"+sum);
	     }
	
	     public static void main4(String[] args) {
			System.out.println("Enther the value of a :");
	    	 int a=sc.nextInt();
			sumFunction(a);
			sumFunction(a,a,a);
			sumFunction(a,a,a,a,a,a,a,a);
		}
	
	          
	
	
	
	       public static void sumArray(int[][] arr1,int[][] arr2) {
	    	   int i,j;
	    	
	    	   int[][] arr3=new int[2][2];
	    	   
	    	  
	    	   for( i=0;i<arr3.length;i++) {
		   			for(  j=0;j<arr3.length;j++) {
		   				arr3[i][j]=arr1[i][j]+arr2[i][j];
		   			 System.out.print(arr3[i][j]+ " ");
				
		   			}
		   			System.out.println();
	    	   }
	    	  
	       }
	       public static void main3(String[] args) {
	    	   int i,j;
	   		int[][] arr1= new int[2][2];
	   		System.out.println("Enter arry elements :");
	   		for( i=0;i<arr1.length;i++) {
	   			for( j=0;j<arr1.length;j++) {
	   		        arr1[i][j]=sc.nextInt();
	   			}
	   		}
	   		
	   	
			int[][] arr2= new int[2][2];
			System.out.println("Enter arry elements :");
			for( i=0;i<arr2.length;i++) {
				for( j=0;j<arr2.length;j++) {
			        arr2[i][j]=sc.nextInt();
				}
			}
			System.out.println("Sum is :");
		 Program.sumArray(arr1, arr2);
			
			
		}
	
	
	
	
	
	
	
	public static void main2(String[] args) {
		int i,j;
		int[][] arr= new int[2][2];
		System.out.println("Enter arry elements :");
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
		        arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are :");
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
				 System.out.print("arr[" + i + "][" + j + "] = "
                         + arr[i][j]);
			}
		}
		
			}
		
		
	
	
	
	
	
	
	
	private static Scanner sc= new Scanner(System.in);
	public static void showUpperCase(String arr[]) {
		System.out.println("Corresponding Upper Case elements are :");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i].toUpperCase()+" ");
	}
	}
	
	public static void main1(String[] args) {
		String[] arr = new String[5];
		System.out.println("Enter string elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element no :"+(i+1));
			arr[i]=sc.nextLine();
		}
		System.out.println("Arry elements are :");
		for(String arrs:arr) {
			System.out.print(arrs+" ");
		}
		System.out.println();
		
		Program.showUpperCase(arr);
	}

}
