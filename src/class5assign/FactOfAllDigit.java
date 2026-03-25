package class5assign;

public class FactOfAllDigit {
public static void main(String[] args) {
	System.out.println(p(32));
}
  public static String p(int n) {
	  String s="";
	  while(n>0) {
	 int digit= n%10;
	 int fact =1;
	
	      while(digit>0) {
	    	  
	    	  fact=fact*digit;
	    	  s="factorial of "+ digit + " is " + fact;
	    	  digit--;
	    	  
	      }
	     
	     
	      n=n/10;
	    
  }
	  
	  return s;
	 
  }
}
