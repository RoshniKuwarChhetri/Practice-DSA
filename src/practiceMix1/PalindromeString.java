package practiceMix1;

public class PalindromeString {
public static void main(String[] args) {
	System.out.println(p("pop"));
}
public static boolean p(String s) {
	String s1=s;
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		reverse=reverse+c;
		
	}
	return(s1.equals(reverse));
}
}
