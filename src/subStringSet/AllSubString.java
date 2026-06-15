package subStringSet;

public class AllSubString {
public static void main(String[] args) {
	p("roshni");
}
public static void p(String str) {
	for(int startIndex=0;startIndex<str.length();startIndex++) {
		for(int endIndex=startIndex+1;endIndex<=str.length();endIndex++) {
			System.out.println(str.substring(startIndex,endIndex));
		}
	}
}
}
