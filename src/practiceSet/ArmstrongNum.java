package practiceSet;

public class ArmstrongNum {
	public static void main(String[] args) {
		System.out.println(p(153));
	}
	public static boolean p(int n) {
		
		int count=0;
		int sum=0;
		int n1=n;
		
		while(n>0) {
			int digit=n%10;
			count++;
			n=n/10;
		}
		int n2=n1;
		while(n1>0) {
			int lastDigit=n1%10;
			sum=(int) (sum+Math.pow(lastDigit,count));
			n1=n1/10;
		}
		
		return n2==sum;
		
	}

}
