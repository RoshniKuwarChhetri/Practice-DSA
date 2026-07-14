package dailyPractice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateInArray {
public static void main(String[] args) {
	char[] a= {'p','o','p'};
	System.out.println(p(a));
}
public static Set<Character> p(char arr[]){
	Set<Character> original=new HashSet<>();
	Set<Character> duplicate=new HashSet<>();
	for(char c: arr) {
		if(original.contains(c)) {
			duplicate.add(c);
		}else {
			original.add(c);
		}
	}
	return duplicate;
}
}
