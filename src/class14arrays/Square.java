package class14arrays;

public class Square {
	public static void main(String[] args) {
		int [] arr= {1,2,3};
		p(arr);
	}
	public static void p(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]*arr[i]);
		}
	}
}
