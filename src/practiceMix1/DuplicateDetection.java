package practiceMix1;

import java.util.HashSet;

public class DuplicateDetection {
public static void main(String[] args) {
	System.out.println(p("roshnii"));
}

public static boolean p(String s) {
	HashSet <Character> set=new HashSet <>();
	for(char c : s.toCharArray()) {
		if(set.contains(c)) {
			return true;
		}
		set.add(c);
	}
	return false;
	
}
}
