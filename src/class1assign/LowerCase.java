package class1assign;

public class LowerCase {
	public static void main(String[] args) {
		System.out.println(lower('a'));
	}
  
	public static String lower(char c) {
		String result="";
		if((c>='a' && c<='z') || (c<='A' && c>='Z')) {
			if(c>='a' && c<='z') {
				result="lowercase";
			}
			else {
				result="not lowercase";
			}
			
		}
		else {
			result="not an alphabet";
		}
		return result;
	}
}
