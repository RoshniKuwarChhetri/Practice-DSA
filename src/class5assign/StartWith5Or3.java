package class5assign;

public class StartWith5Or3 {
public static void main(String[] args) {
	System.out.println(p(05345));
}
   public static String p(int n) {
	   int rev=0;
	   String result="";
	   while(n>0) {
		   int last=n%10;
		   rev=rev*10+last;
		   n=n/10;
	   }
	     int first=rev%10;
	     if(first==5) {
	    	 result="start with 5";
	     }
	     else if(first==3) {
	    	 result="start with 3";
	     }
	     else {
	    	 result="does not start with 5 or 3";
	     }
	     return result;
   }
}
