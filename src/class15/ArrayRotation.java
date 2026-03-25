package class15;

public class ArrayRotation {
 public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int k=arr[0];
	for(int i =0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	
	}
	arr[arr.length-1]=k;
	for(int x: arr) {
		System.out.println(x);
	}
}
}

//temp should be included in the nexted loop