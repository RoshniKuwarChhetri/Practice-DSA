package practiceSetSubArray;

public class MaxSumInSubArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,6};
	System.out.println(p(arr));
}
public static int p(int arr []) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		if(sum>max) {
			max=sum;
		}
	}
	return max;
}
}
