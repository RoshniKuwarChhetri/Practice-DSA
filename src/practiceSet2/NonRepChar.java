package practiceSet2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class NonRepChar {
public static void main(String[] args) {
	System.out.println(p("rroshni"));
}
public static Character p(String s){
	HashMap<Character,Integer> map=new HashMap<>();
	
    
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(map.containsKey(c)) {
			int x=(map.get(c));
			map.put(c,x+1);
		}else {
			map.put(c, 1);
		}
	}
	
	for(char x: s.toCharArray()) {
		if(map.get(x)==1) {
			return x;
		}
	}
	return null;
	
}
}
