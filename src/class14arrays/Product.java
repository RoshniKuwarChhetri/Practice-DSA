package class14arrays;

public class Product {
	public static void main(String[] args) {
		int [] arr= {1,2,3};
		System.out.println(p(arr));
	}
	public static int p(int[] arr) {
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
		}
		return product;
	}
}
