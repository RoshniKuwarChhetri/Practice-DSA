package practiceSorting;

public class MergSort {
	public static void mergS(int arr[], int left , int right) {
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
		mergS(arr,left,mid);
		mergS(arr,mid+1,right);
		merg(arr,left,mid,right);
		
	}
	public static void merg(int arr[], int left ,int mid, int right) {
		int temp[]=new int[right-left+1];
		int i=left;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=right) {
			temp[k++]=arr[j++];
		}
		for(int x=0;i<temp.length;x++) {
			arr[left+x]=temp[x];
		}
		
	}
public static void main(String[] args) {
	int arr []= {1,2,3,5,6,11,2,9,8,7,6,5,4};
	System.out.println(mergS(arr,0,14));
}
}
