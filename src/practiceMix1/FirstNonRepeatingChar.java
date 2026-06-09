package practiceMix1;

import java.util.HashMap;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	System.out.println(p("rroshni"));
}
public static char p(String s) {
 HashMap<Character,Integer> map=new HashMap<>();
 
 for(int i=0;i<s.length();i++) {
	 char c=s.charAt(i);
	 if(map.containsKey(c)) {
		 int x=map.get(c);
		 map.put(c, x+1);
	 }else
	 map.put(c, 1);
	 
 }
 
 for(int i=0;i<s.length();i++) {
	 char c=s.charAt(i);
	 if(map.get(c)==1) {
		 return c;
	 }
 }
 return '/';
}
}
