package practiceArray;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]= {-1,-2,-8,0,2};
	System.out.println(p(arr));
}
public static int p(int arr[]) {
	int max = Integer.MIN_VALUE;
	int sMax= arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			sMax=max;
			max=arr[i];
			
		}
		else if(arr[i]>sMax && arr[i]<max) {
			sMax=arr[i];
		}
	}
	return sMax;
}
}
