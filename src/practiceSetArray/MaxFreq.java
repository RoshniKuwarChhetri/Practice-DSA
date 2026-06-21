package practiceSetArray;

import java.util.HashMap;

public class MaxFreq {
	public static void main(String[] args) {
		char c[]= {'2','e','e'};
		System.out.println(p(c));
	}
public static char p(char arr[]) {
	HashMap<Character,Integer> map=new HashMap<>();
	int max=0;
	char c=' ';
	
	for(char a: arr) {
		int count=0;		
		if(map.containsKey(a)) {
			int x=map.get(a);
			 count=x+1;
		map.put(a,count);
		}else {
			 count=1;
			 map.put(a, count);
		}
		
		if(count>max) {
			max=count;
			c=a;
		}
	}
	return c;
}
}
