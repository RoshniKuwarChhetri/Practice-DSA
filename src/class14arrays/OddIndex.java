package class14arrays;

public class OddIndex {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		p(arr);
	}
	public static void p(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
