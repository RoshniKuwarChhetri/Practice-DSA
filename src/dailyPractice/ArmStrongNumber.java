package dailyPractice;

public class ArmStrongNumber {
public static void main(String[] args) {
	System.out.println(ana(153));
}

public static boolean ana(int n) {
	int n1=n;
	int count=0;
	double sum=0;
	while(n>0) {
		int last=n%10;
		count++;
		n=n/10;
	}
	int n2=n1;
	while(n1>0) {
		int lastDigit=n%10;
		sum=sum+Math.pow(lastDigit, count);
		n1=n1/10;
	}
	return sum==n2;	
	
}
 
}
