package subArray;

public class MoveZero {
public static void main(String[] args) {
	int arr[]= {1,0,8,0,0,8,9,0,0,1,2,3,4};
	p(arr);
}
public static void p(int arr[]) {
	
	int end =0;
	for(int i=0;i<arr.length;i++)
		if(arr[i]!=0) {
			int temp= arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
			end++;
		}
	for(int c:arr) {
		System.out.print(c);
	}
	}
	
}

