package practiceSetString;

public class Panagram {
public static void main(String[] args) {
	System.out.println(p("the quick black fox JumPED over a Lazy DOg"));
}
public static boolean p(String str) {
	String s=str.toLowerCase();
	for(char c:s.toCharArray()) {
		if(!s.contains(String.valueOf(c))) {
			return false;
		}
	}
	return true;
}
}
