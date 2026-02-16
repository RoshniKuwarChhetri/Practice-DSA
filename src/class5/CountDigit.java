package class5;

import java.util.Scanner;

public class CountDigit {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number to cont the digit :");
	int n=sc.nextInt();
	
	System.out.println("count of the number is "+p(n));
	
}
  
  public static int p(int n) {
	  int count =0;
	  while(n>0) {
		  n=n/10;
		  count++;
	  }
	  return count;
  }
}
