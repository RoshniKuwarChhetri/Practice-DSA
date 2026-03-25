package class14arrays;

public class Strong {
	public static void main(String[] args) {
		int [] arr= {1,2,3,145};
		p(arr);
	}
	public static void p(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			
			int sum=0;
			while(n>0) {
				int last=n%10;
				int fact=1;
				for(int j=1;j<=last;j++) {
					fact=fact*j;
				}
			sum=sum+fact;
			n=n/10;
					
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}
// fact above fact loop & sum before last digit
