package practiceMix1;

public class LargestElement {
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,9,-2};
	System.out.println(p(arr));
}
 public static int p(int [] arr) {
	 int max=Integer.MIN_VALUE;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>max) {
			 max=arr[i];
		 }
	 }
	 return max;
 }
}
