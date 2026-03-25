package class14arrays;

public class Secondhalf {
	public static void main(String[] args) {
		int [] arr= {1,2,5,8,3,3,3};
		p(arr);
	}
	public static void p(int[]arr) {
		for(int i=(arr.length)/2;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
