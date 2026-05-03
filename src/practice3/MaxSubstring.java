package practice3;

public class MaxSubstring {

	public static void main(String[] args) {
		
	}
	public static int p(int  arr[]) {
		int max=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
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
