package practiceSetString;

public class ReverseWordInSentence {
public static void main(String[] args) {
	System.out.println(p("i am a developer"));
}
public static String p(String s) {
	String rev="";
	String word="";
	for(char c: s.toCharArray() ) {
		if(c!=' ') {
			word=word+c;
		}
		else {
			rev=word+" "+rev;
			word="";
		}
	}
	rev=word+" "+rev;
	return rev.trim();
	
}
}
