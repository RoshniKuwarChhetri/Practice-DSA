package practiceSorting;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr= {1,3,4,2,4};
	
		for(int i =1;i<arr.length;i++) {
		int curr=arr[i];
		int prev=i-1;
		
		while(prev>=0 && arr[prev]>curr) {
		 arr[prev+1]=arr[prev];
		 prev--;
		}
		arr[prev+1]=curr;
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
	}

}
