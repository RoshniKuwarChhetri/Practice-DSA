package practiceString;

public class PanagramString {
	public static void main(String[] args) {
		System.out.println(p("The quick rown fox jumps over the lazy dog"));
	}
	
	public static boolean p(String s) {
		s.toLowerCase();
		boolean isPanagram=true;
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(String.valueOf(ch))){
				isPanagram=false;
			}
		}
		return isPanagram;
	}

}
