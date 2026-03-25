package class14arrays;

public class MaxEle {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		p(arr);
	}
	public static void p(int[] arr) {
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		
		}
		System.out.println(max);
	}
}
