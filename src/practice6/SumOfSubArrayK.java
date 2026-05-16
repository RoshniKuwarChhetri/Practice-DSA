package practice6;

import java.util.HashMap;

public class SumOfSubArrayK {
  public static void main(String[] args) {
	  int a[]= {1,2,3};
	  System.out.println(p(a,3));
	
}
  public static int p(int arr[],int k) {
	  HashMap <Integer, Integer>map= new HashMap<>();
	 map.put(0, 1);
	 int count =0;
	 int sum=0;
	 for(int i=0;i<arr.length;i++) {
		 sum+=arr[i];
		 
		 if(map.containsKey(sum-k)) {
			count += map.get(sum-k);
		 }
		 map.put(sum, map.getOrDefault(sum, 0)+1);
	 }
	  return count;
  }
}
