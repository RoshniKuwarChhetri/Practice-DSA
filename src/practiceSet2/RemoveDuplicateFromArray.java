package practiceSet2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
public static void main(String[] args) {
	char arr[]= {'a','p','p','l','e'};
	System.out.println(p(arr));
}
public static List<Character> p(char arr []){
	List<Character> list= new ArrayList<>();
	Set<Character> set =new HashSet<>();
	
	for(char c: arr) {
		if(list.contains(c)) {
			set.add(c);
		}else {
			list.add(c);
		}
	}
	return list;
}
}
