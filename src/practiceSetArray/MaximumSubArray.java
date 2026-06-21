package practiceSetArray;

public class MaximumSubArray {
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,7,8,4,5,7};
	System.out.println(p(arr));
}
public static int p(int arr[]) {
	int max=Integer.MIN_VALUE;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=arr[i]+sum;
		
		
		if(sum>max) {
			max=sum;
		}
		
		if(sum<0) {
			sum=0;
		}
	}
	return max;
}
}
