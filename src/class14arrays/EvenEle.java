package class14arrays;

public class EvenEle {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		p(arr);
	}
	public static void p(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
		}
	}
}
