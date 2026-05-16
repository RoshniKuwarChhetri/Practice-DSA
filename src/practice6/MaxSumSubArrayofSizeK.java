package practice6;

public class MaxSumSubArrayofSizeK {
	public static void main(String[] args) {
		int arr[]= {2,1,5,1,3,2};
		System.out.println(p(arr,3));
	}
	
	public static int p(int arr[], int k) {
		int sum=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int max=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i]-arr[i-k];
			max=Math.max(sum, max);
		}
		return max;
	}

}
