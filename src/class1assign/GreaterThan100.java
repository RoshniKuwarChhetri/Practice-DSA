package class1assign;

import java.util.Scanner;

public class GreaterThan100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		
		System.out.println(p(n));
			
		
	}
  
	public static String p(int n) {
		String result ="";
		if(n>100) {
			result= n+" is greater than 100";
		}
		else {
			result=n+" not greater than 100";
		}
		return result;
	}
}
