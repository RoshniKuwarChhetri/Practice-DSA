package practiceSetArray;

public class RotateArrayByK {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int k=5;
	p(arr,k);
	for(int i:arr) {
		System.out.println(i);
	}
}
public static void p(int arr[], int k) {
	int n=arr.length;
	k=k%n;
	reverse(arr, 0, n-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
  
	}

public static void reverse(int arr[],int start,int end) {
	
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
}
	
}
}
