package practiceSetSearchAndsort;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr= {5,4,3,2,1};
	p(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void p(int arr[]) {
	for(int i =0;i<arr.length-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minIndex]) {
				minIndex=j;
			}
		}
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
	}
	
}
}
