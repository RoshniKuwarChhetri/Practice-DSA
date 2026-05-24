package practiceString;

public class PanagramString {
	public static void main(String[] args) {
		System.out.println(p("The quick brown fox jumps over he lazy dog"));
	}
	
	public static boolean p(String s) {
		String s1=s.toLowerCase();
		//boolean isPanagram=true;
		for(char ch='a';ch<='z';ch++) {
			if(!s1.contains(String.valueOf(ch))){
				return false;
			}
		}
		return true;
	}

}
