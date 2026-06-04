package practiceArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//import com.sun.tools.javac.util.List;

public class ReturnRepeatingElements {
public static void main(String[] args) {
	char arr[]= {'A','P','P','L','E'};
	System.out.println(p(arr));
}
public static List<Character> p(char arr[]){
	HashSet <Character> set = new HashSet<>();
	List <Character> list= new ArrayList<>();
	for(char x:arr) {
		if(set.contains(x)) {
			list.add(x);
		}else {
			set.add(x);
		}
		
	}
	return list;
}
}
