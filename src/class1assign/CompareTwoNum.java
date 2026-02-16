package class1assign;

import java.util.Scanner;

public class CompareTwoNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("enter a number");	
		int a=sc.nextInt();
		System.out.print("Enter another number");
		int b=sc.nextInt();
		
		System.out.println(greatest(a,b));
	}
   
	public static String greatest(int a, int b) {
		String result ="";
		
		if(a>b) {
			result=a+" is greatest";
		}
		else {
			result=b+" is greatest";
		}
		return result;
	}
}
