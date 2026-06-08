package practiceMix1;

import java.util.HashMap;

public class CharacterFrequency {
public static void main(String[] args) {
	System.out.println(p("roshnooi"));
}
public static HashMap<Character,Integer> p(String s) {
	HashMap<Character,Integer> map=new HashMap<>();	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(map.containsKey(c)) {
			int x=map.get(c);
			map.put(c,x+1);
		}
		else {
			map.put(c,1);
		}
	}
	return map;
}
}
