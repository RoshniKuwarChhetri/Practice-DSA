package class14arrays;

public class Armstrong {
	public static void main(String[] args) {
		int [] arr= {370,3701,407,111,222,1634};
		p(arr);
	}
	public static void p(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int n2=n;
			int count =0;
			
			while(n>0) {
//				int last=n%10;
				count++;
				n=n/10;
			}
			int sum=0;
			
			while(n2>0) {
				int lastDigit=n2%10;
				int result=1;
			
//			int n3=n2;
			for( int j=1;j<=count;j++) {
				
				result=result*lastDigit;
			}
			sum=sum+result;
			n2=n2/10;
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}
//result/fact is define inside last digit loop
