package dailyPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoDuplicateFromarray {
public static void main(String[] args) {
	int arr[]= {1,2,3,3,3,4,5,5,6,7,8,9,9,9};
	System.out.println(p(arr));
}
public static Set<Integer> p(int arr[]){
	Set<Integer> set= new LinkedHashSet<Integer>();
	for(int i:arr) {
		set.add(i);
	}
	return set;
}
}
