package practiceSet;

import java.util.HashMap;

public class Maxoccurance {
public static void main(String[] args) {
	p("apple");
}
public static void p(String str) {
	HashMap<Character,Integer> map= new HashMap<>();
	for(char c:str.toCharArray()) {
		if(map.containsKey(c)) {
			int x=map.get(c);
			map.put(c, x+1);
		}else {
			map.put(c,1);
		}
	}
	char maxChar=' ';
	int maxCount=0;
	
	 for (char ch : map.keySet()) {
		if(map.get(ch)>maxCount) {
			maxCount=map.get(ch);
			maxChar=ch;
		}
	}
	 System.out.println("char  is" + " " + maxChar  + " "+ "and its occurance is" + " " + maxCount);
	 
}
}
