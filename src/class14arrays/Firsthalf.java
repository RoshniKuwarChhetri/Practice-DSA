package class14arrays;

public class Firsthalf {
	public static void main(String[] args) {
		int [] arr= {1,2,5,3,3,3,3};
		p(arr);
	}
	public static void p(int[]arr) {
		for(int i=0;i<=arr.length/2;i++) {
			System.out.println(arr[i]);
		}
	}
}
