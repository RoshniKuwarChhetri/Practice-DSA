package practiceMix1;

public class PrimeCheck {
 public static void main(String[] args) {
	System.out.println(p(8));
}
public static boolean p(int n) {
	int count =0;
	boolean isPrime=true;
	for(int i =1;i<=n;i++) {
		if(n%i==0) {
			count ++;
		}
		
	}
	if (count>2) {
		isPrime=false;
	}
	return isPrime;
}
}
