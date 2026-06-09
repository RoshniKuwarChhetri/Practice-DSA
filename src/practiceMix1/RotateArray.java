package practiceMix1;

public class RotateArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	rotate(arr,3);
}

   public static void reverse(int arr[] , int i,int j) {
	while(i<j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
    public static void rotate(int arr[],int k) {
		int n=arr.length-1;
		 k=k%n;
		 reverse(arr,0,n);
		 reverse(arr,0,k-1);
		 reverse(arr,k,n);
		 
		 for(int x:arr) {
			 System.out.println(x);
		 }
	}
}
