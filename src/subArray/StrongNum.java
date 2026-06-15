package subArray;

public class StrongNum {
	public static void main(String[] args) {
		System.out.println(p(145));
	}
 
public static boolean p(int n) {
	int n1=n;
	int sum=0;
	while(n>0) {
		int digit=n%10;
		int fact=1;
		for(int i =1;i<=digit;i++) {
			fact=fact*i;
			
		}
		sum=sum+fact;
		n=n/10;
	}
	return n1==sum;
}
}
