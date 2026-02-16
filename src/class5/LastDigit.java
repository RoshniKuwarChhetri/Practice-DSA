package class5;

import java.util.Scanner;

public class LastDigit {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter number here : ");
	
	int n=sc.nextInt();
	System.out.println("reverse of entered number is " + p(n));
}
   
   public static int p(int n) {
	   
	   int rev=0;
	   while(n>0) {
	   int last_digit=n%10;
	   rev= rev*10+last_digit;
	   n=n/10;
	   }
	   return rev;
   }
}
