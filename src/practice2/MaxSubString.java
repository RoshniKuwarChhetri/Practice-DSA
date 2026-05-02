package practice2;

import java.util.HashSet;

public class MaxSubString {
	public static void main(String[] args) {
		System.out.println(p("hello world"));
	}
	
	public static int p(String s) {
		int maxLength=0;
		for(int i=0;i<s.length();i++) {
			String word="";
			HashSet set=new HashSet();
			for(int j=i;j<s.length();j++) {
				if(set.contains(j)) {
					break;
				}
				word=word+s.charAt(j);
				set.add(s.charAt(j));
			}
			if(maxLength<word.length()) {
				maxLength=word.length();
			}
		}
		return maxLength;
	}

}
