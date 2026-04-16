package class25;

import java.util.HashMap;

public class FreqOfCharInStrUsingBuildInHashMap {
 
	public static void main(String[] args) {
		String s="hello World";
		HashMap<Character,Integer> hash=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') continue;
			if(hash.containsKey(c)) {
				int x=hash.get(c)+1;
				hash.put(c, x);}
				else {
					hash.put(c, 1);
			}
		}
		System.out.println(hash);
	}
}
