package class26;

public class Substring {
public static void main(String[] args) {
	
	String s="hello";
	
	for(int i =0;i<s.length();i++) {
		String word="";
		for(int j=i;j<s.length();j++) {
			 word = word+s.charAt(j);
			System.out.println(word);
		}
	}
}
}
