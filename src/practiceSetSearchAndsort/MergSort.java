package practiceSetSearchAndsort;

public class MergSort {
public static void main(String[] args) {
	int arr[]= {5,4,3,1};
	mergS(arr,0,arr.length-1);
	for(int i:arr) {
		System.out.print(i);
	}
}
public static void mergS(int arr[],int start,int end) {
	if(start>=end) {
		return;
	}
    
	int mid=(start+end)/2;
	mergS(arr,start ,mid);
	mergS(arr,mid+1,end);
	merg(arr,start,mid,end);
}
public static void merg(int arr[],int start,int mid,int end) {
	
	int temp[]=new int[end-start+1];
	int i=start;
	int j=mid+1;
	int k=0;
	while(i<=mid && j<=end) {
		if(arr[i]<=arr[j]) {
			temp[k++]=arr[i++];
		}else {
			temp[k++]=arr[j++];	
		}
	}
	while(i<=mid) {
		temp[k++]=arr[i++];
	}
	while(j<=end) {
		temp[k++]=arr[j++];
	}
	
	for(int p = 0; p < temp.length; p++) {
        arr[start + p] = temp[p];
    }
}

}
