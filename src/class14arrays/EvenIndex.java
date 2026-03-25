package class14arrays;

public class EvenIndex {
	public static void main(String[] args) {
		int [] arr= {1,2,5,3,3,3,3};
		p(arr);
	}
	public static void p(int[]arr) {
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	}
}
