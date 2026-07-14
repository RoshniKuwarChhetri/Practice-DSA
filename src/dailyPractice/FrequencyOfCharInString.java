package dailyPractice;

import java.util.HashMap;

public class FrequencyOfCharInString {
public static void main(String[] args) {
	System.out.println(p("roshni"));
}
public static HashMap<Character,Integer> p(String s){
	HashMap<Character,Integer> map=new HashMap<>();
	for(char c: s.toCharArray()) {
		if(map.containsKey(c)) {
			int x=map.get(c);
			map.put(c,x+1);
		}
		else {
			map.put(c, 1);
		}
	}
	return map;
}

}
