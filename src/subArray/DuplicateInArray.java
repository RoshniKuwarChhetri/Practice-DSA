package subArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {
 public static void main(String[] args) {
	char c[]= {'A','p','p','l','e' };
	System.out.println(p(c));
}
 public static Set<Character> p(char [] ch) {
	List<Character> list =new ArrayList<Character>();
	Set<Character> set=new HashSet<Character>();
	
	for(char x: ch) {
		if(list.contains(x)) {
			set.add(x);
		}
		else {
			list.add(x);
		}
	}
	return set;
			
}
}
