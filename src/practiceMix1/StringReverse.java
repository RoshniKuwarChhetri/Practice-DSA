package practiceMix1;

public class StringReverse {
 public static void main(String[] args) {
	System.out.println(p("roshni"));
}
 public static String p(String s) {
	 String rev="";
	
	 for(int i=s.length()-1;i>=0;i--) {
		 char c=s.charAt(i);
		 rev=rev+c;
	 }
	 return rev;
 }
}
