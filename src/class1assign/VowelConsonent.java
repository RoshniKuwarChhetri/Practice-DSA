package class1assign;

public class VowelConsonent {
	public static void main(String[] args) {
		System.out.println(VC('@'));
	}
 
	public static String VC(char c) {
		String result="";
		if((c>='A' && c<='Z')|| (c>='a' && c<='z')) {
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='U') {
			result="vowel";
		   }
		else {
			result="consoment";
		}
		}
		else {
			result="not an alphabet";
		}
		return result;
	}
}
