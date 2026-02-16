package class5assign;

public class EndwithOddOrEven {
public static void main(String[] args) {
	System.out.println(p(120));
}
  public static String p(int n) {
	
	      String result="";
		  int last=n%10;
		  if(last%2==0) {
			  result="even";
		  }
		  
		  else {
			  result="odd";
		  }
		  return result;
	 
  }
}
