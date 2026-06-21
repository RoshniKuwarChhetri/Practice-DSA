package practiceSetArray;

public class MoveZeroToEnd {
public static void main(String[] args) {
	int arr[]= {1,3,0,9,0,0,7,7,7};
	p(arr);
	for(int i:arr) {
		System.out.println(i);
	}
}
public static void p(int arr[]) {
	int j=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		
	}
	
}
}
