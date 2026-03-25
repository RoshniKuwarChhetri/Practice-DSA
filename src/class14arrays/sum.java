package class14arrays;

public class sum {

	public static void main(String[] args) {
		int [] arr= {1,2,3};
		System.out.println(p(arr));
	}
	public static int p(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
