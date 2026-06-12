package subArray;

import java.util.HashMap;

public class TwoSum {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int result[]=p(arr,5);
	System.out.print(result[0]+ "  "+result[1]);
	
}
public static int [] p(int [] arr,int target ) {
	HashMap<Integer,Integer> map= new HashMap<>();
	//int target=arr[0];
	for(int i=0;i<arr.length;i++) {
		int diff=target-arr[i];
		if(map.containsKey(diff)) {
			return new int[] {map.get(diff),i};
		}
		map.put(arr[i],i);
	}
	
	return new int[] {-1,-1};	
	
}
}
