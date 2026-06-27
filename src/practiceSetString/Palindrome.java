package practiceSetString;

public class Palindrome {
public static void main(String[] args) {
	System.out.println(p("123"));
}

public static boolean p(String s) {
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		reverse=reverse+c;
	}
	if(reverse.equals(s)) {
		return true;
	}
	return false;
}
}
