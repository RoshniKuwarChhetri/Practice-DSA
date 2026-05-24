package practiceSearch;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2};
		System.out.println(p(arr,0));
	}
	public static int p(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
			
		}
		return -1;
	}

}
