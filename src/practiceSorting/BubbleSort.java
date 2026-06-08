package practiceSorting;

public class BubbleSort {
public static void main(String[] args) {
	int arr[] = {3,1,2,4,2};
	p(arr);
	for(int x:arr) {
		System.out.println(x);
	}
}
public static void p(int arr []) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<(arr.length)-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
			
		}
	}
}
}
