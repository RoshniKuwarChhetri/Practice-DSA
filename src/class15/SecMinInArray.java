package class15;

public class SecMinInArray {

	public static void main(String[] args) {
		int []arr= {3,4,5,-1};
		int min=arr[0];
		int sMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				sMin=min;	
				min=sMin;
			}
			else if(arr[i]<min && arr[i]>sMin) {
				arr[i]=sMin;
			}
		}
		System.out.println(sMin);
	}
}
