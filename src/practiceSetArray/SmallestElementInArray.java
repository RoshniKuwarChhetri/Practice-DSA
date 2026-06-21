package practiceSetArray;

public class SmallestElementInArray {
public static void main(String[] args) {
	int arr[] ={1,3,4,0,-5};
	System.out.println(p(arr));
}
public static int p(int arr[]) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=min) {
			min=arr[i];
		}
	}
	return min;
}
}
