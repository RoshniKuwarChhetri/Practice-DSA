package practiceMix1;

public class BubbleSort {
public static void main(String[] args) {
	int arr []= {1,4,5,6,2,0};
	p(arr);
	for(int x:arr) {
		System.out.print(x+ " ");
	}
}
public static void p(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
}
}
