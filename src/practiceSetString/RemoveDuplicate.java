package practiceSetString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		System.out.println(p("hello"));
	}

	public static List p(String s) {
		List<Character> list=new ArrayList<Character>();
		Set<Character> set=new HashSet<Character>();
		for(char c: s.toCharArray()) {
		     if(list.contains(c)) {
		    	 set.add(c);
		     }else {
		    	 list.add(c);
		     }
		}
		return list;
	}
}
