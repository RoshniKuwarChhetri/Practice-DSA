package dailyPractice;

import java.util.HashMap;

public class NonRepCharInString {
public static void main(String[] args) {
	System.out.println(p("roshni"));
}
public static char p(String s) {
	HashMap<Character,Integer> map=new HashMap<>();
	for(char c:s.toCharArray()) {
		if(map.containsKey(c)) {
			int x=map.get(c);
			map.put(c, x+1);
		}else {
			map.put(c,1);
		}
	}
	
	
	
	for(char c:s.toCharArray()) {
		if(map.get(c)==1) {
			return c;
		}
	}
	return '-';
}
}
