package practice2;

import java.util.HashMap;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		System.out.println(p("hi"));
	}
	public static HashMap<Character,Integer> p(String s){
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.containsKey(c)) {
				int x=hm.get(c);
				hm.put(c, x+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		return hm;
	}
	
	

}
