package practiceMix1;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,3,4,5,6,7,8};
	System.out.println(BinaryS(arr,0));
}
public static int BinaryS(int arr [], int target) {
	int start=0;
	int end=arr.length-1;
	if(arr[start]>arr[end]) {
		return -1;
	}
	else {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return  mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
	}
	return -1;
}
}
