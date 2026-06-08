package practiceMix1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {
public static void main(String[] args) {
	int arr[]= {1,2,33,44,33,44,55,66};
	System.out.println(p(arr));
}

public static Set<Integer> p(int arr[]){
	List<Integer> list =new ArrayList<>();
	Set<Integer> set=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		int x=arr[i];
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
