package class27;
import java.util.HashSet;
import java.util.Set;
public class LongestSubWithUniqueChar {
	public static void main(String[] args) {
		String s="programming world";
		int max=0;
		String maxWord="";
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
			if(word.length()>max) {			
				max=word.length();
				maxWord=word;				
			}		
		}
		System.out.println(max);
		System.out.println(maxWord);
	}
}




