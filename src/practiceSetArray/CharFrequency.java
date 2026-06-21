package practiceSetArray;

import java.util.HashMap;

public class CharFrequency {
public static void main(String[] args) {
	System.out.println(p("hello"));
}
public static HashMap<Character,Integer> p(String s){
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(char c :s.toCharArray()) {
		if(map.containsKey(c)) {
			int x=map.get(c);
			map.put(c, x+1);
		}else {map.put(c,1);}
		
	}
	return map;
}
}
