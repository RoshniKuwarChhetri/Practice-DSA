package practiceArray;

public class MoveZeroToTheEnd {
	public static void main(String[] args) {
		int[] arr= {1,0,7,0,8,0};
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				j++;
			}
		}
		for(int x: arr) {
			System.out.println(x+ " ");
		}
	}

}
