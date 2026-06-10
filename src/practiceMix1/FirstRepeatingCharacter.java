package practiceMix1;

import java.util.HashMap;

public class FirstRepeatingCharacter {
public static void main(String[] args) {
	System.out.println(p("rooshni"));
}
public static char p(String s) {
	HashMap<Character,Integer> map= new HashMap<>();
	for(char c:s.toCharArray()) {
		if(map.containsKey(c)) {
			int x= map.get(c);
			map.put(c, x+1);
		}else {
			map.put(c,1);
		}
	}
	for(char c:s.toCharArray()) {
		if(map.get(c)>=2) {
			
			return c;
		}
	}
	return '_';
}

}
