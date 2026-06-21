package practiceSetArray;

public class SecLargestInArray {
 public static void main(String[] args) {
	 int arr[]= {1,2,4,6,-9,-8,0};
	System.out.println(p(arr));
}
 public static int p(int arr[]) {
	 int max=Integer.MIN_VALUE;
	 int sMax=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>max) {
			 sMax=max;
			 max=arr[i];
			 
		 }else if(arr[i]<= max && arr[i]>=sMax){
			 sMax=arr[i];
		 }
	 }
	 return sMax;
 }
}
