package practiceArray;

public class LargestNumber {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	System.out.println(p(arr));
}
public static int p(int arr []) {
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=max) {
			max=arr[i];
		}
	}
	return max;
}
}
