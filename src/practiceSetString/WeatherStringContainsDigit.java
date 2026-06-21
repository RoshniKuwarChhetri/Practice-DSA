package practiceSetString;

public class WeatherStringContainsDigit {
public static void main(String[] args) {
	System.out.println(p("Roshni))0"));
}
public static boolean p(String s) {
	for(char c: s.toCharArray()) {
		if(c>='0' && c<='9') {
			return true;
		}
	}
	return false;
}
}
