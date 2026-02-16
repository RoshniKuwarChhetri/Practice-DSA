package class5assign;

public class Divby7orContain7 {
public static void main(String[] args) {
	System.out.println(p(123457));
}
  public static String p(int n) {
	  String result="";
	  int rev=0;
	  while(n>0) {
		  if(n%7==0) {
			  result="div by 7";
			  break;
		  }
		  int last=n%10;
		  
		   if(last==7) {
			  result="7 is present";
			  break;
		  }
		  
		   else if(n%7==0 && last==7) {
			   result="both";
			   break;
		   }
		  else {
			  result="nither div by 7 nor 7 is prsent";
		  }
		  n=n/10;
		  
	  }
	  return result;
  }
}
