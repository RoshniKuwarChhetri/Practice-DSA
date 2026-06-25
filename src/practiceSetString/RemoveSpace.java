package practiceSetString;

public class RemoveSpace {
public static void main(String[] args) {
	System.out.println(p("hello world"));
}
public static String p(String s) {
	String result="";
	for(char c: s.toCharArray()) {
		if (c!=' ') {
			result=result+c;
		}
	}
	return result;
}
}
