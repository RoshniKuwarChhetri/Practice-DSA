package class15;

public class RotateKTimes {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int k=1;
	for(int i=1;i<=k;i++) {
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
	}
	
	for(int x: arr) {
		System.out.println(x);
	}
	
}
}
