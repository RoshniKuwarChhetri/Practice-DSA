package practiceSetSearchAndsort;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]= {2,3,1,4,5};
	p(arr);
	for(int a:arr) {
		System.out.println(a);
	}
}
public static void p(int arr[]) {
	//int j=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
}
}
