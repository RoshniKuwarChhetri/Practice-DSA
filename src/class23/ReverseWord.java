package class23;

public class ReverseWord {
	public static void main(String[] args) {
		System.out.println(revWord("hello world"));
	}
	public static String revWord(String s) {
		
		String word=" ";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' '){
			     word=word+c;	
			}
			else {
				word=word+c;
				rev=word+rev;
				word="";
			}
			
			
		}
		rev=word+rev;
		return rev;
	}

}
