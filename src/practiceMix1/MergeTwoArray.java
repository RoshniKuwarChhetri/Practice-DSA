package practiceMix1;

public class MergeTwoArray {
public static void main(String[] args) {
	int arr1 []= {1,2,3,4};
	int arr2 []= {5,6,7,8};
	merge(arr1,arr2);
}
public static void merge(int arr1 [], int arr2 []) {
	int arr3[]=new int[(arr1.length)+(arr2.length)];
	int i=0;
	for(int x:arr1) {
		
		arr3[i++]=x;
	}
	for(int x:arr2) {
		
		arr3[i++]=x;
	}
	
	for(int x:arr3) {
		System.out.println(x);
	}
}
}
