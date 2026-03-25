package class20;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {5,4,3,2,1,0};
	int n=arr.length;
	for(int i=0;i<n;i++) {
		int min=i;
		for(int j=i;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	for(int a:arr) {
	System.out.println(a);	
	}
}
}
