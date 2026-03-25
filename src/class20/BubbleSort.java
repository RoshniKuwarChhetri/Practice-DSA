package class20;

public class BubbleSort {
  public static void main(String[] args) {
	
   
	int arr[]= {5,4,3,2,1,0};
	int n=arr.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		//System.out.print();
	}
	for(int a:arr) {
		System.out.println(a);
	}
}
}