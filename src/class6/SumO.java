package class6;

import java.util.Scanner;

public class SumO {
  public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.print("enter a number: ");
	  int n=sc.nextInt();
	System.out.println(p(n));
}
  public static int p( int n) {
	  int sum=0;
	  if(n==0) {
		  sum=0;
	  }
	  
	  for(int i=1;i<=n;i++) {
		  sum=sum+i;
	  }
	  return sum;
  }
}
