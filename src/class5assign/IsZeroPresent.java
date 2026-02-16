package class5assign;

public class IsZeroPresent {
  public static void main(String[] args) {
	System.out.println(p(000));
}
  public static boolean p(int n) {
	  boolean present=false;
	  if(n==0) {
		  present= true;
	  }
	  while(0<n) {
		  int last =n%10;
		  if(last==0) {
			 present=true;
			 break;
		  }
		  else {
		  present= false;
		  }
		  n=n/10;
		 
	  }
	  return present;
  }
}
