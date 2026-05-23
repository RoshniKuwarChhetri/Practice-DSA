package practiceString;

public class Palindrome {
public static void main(String[] args) {
	System.out.println(palindr("pop"));
}
public static boolean palindr(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char c= s.charAt(i);
		rev=rev+c;
	}
	return rev.equals(s);
		
	
}
}
