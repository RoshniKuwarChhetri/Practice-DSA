package class27;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubString {
	
	public static void main(String[] args) {
		p("programming world");
	}
	public static void p(String s) {
		for(int i=0;i<s.length();i++) {
			String word="";
			Set s1=new HashSet();
			for(int j=i;j<s.length();j++) {
				char c =s.charAt(j);
				if(s1.contains(c)) {
					//System.out.println( word);
					break;
				}
				word=word+c;
				s1.add(c);
				
			}
			
			System.out.println(s1);
		}
		
	}

}
