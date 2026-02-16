package class5;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number here :");
		int n= sc.nextInt();
		System.out.println("false is for not a palindrome");
		System.out.println("true is for palindrome");
		System.out.println(p(n));
		
		
	}
	public static boolean p(int n) {
		int i=n;
		int rev=0;
		while(n>0) {
			int last_digit=n%10;
			
			
			rev=rev*10+last_digit;
			n=n/10;
			
		}
		return i==rev;
	}
}


