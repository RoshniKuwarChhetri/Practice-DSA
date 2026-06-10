package practiceMix1;

public class StringReverseUsingRecursion {
public static void main(String[] args) {
	System.out.println(p("roshni"));
}
public static String p(String s) {
	if(s.equals("")) {
		return s;
	}
	
	return p(s.substring(1)) + s.charAt(0);
}
}
