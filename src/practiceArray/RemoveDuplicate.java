package practiceArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		char[] c= {'h','a','p','p','y'};
		System.out.println(p(c));
	}
	public static HashSet<Character> p(char arr[]) {
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		return set;
		
		
		}
	

}
