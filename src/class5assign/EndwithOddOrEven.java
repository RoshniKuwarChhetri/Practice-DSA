package class5assign;

public class EndwithOddOrEven {
public static void main(String[] args) {
	System.out.println(p(121));
}
  public static String p(int n) {
	
	      String result="";
		  
		  if(n%2==0) {
			  result="even";
		  }
		  
		  else {
			  result="odd";
		  }
		  return result;
	 
  }
}
