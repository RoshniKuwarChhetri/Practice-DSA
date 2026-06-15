package practiceSet;

public class PrimeCheck {
public static void main(String[] args) {
	
	System.out.println(p(8));
}
public static boolean p(int n) {
	int count=0;
	for(int i=2;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	return count==1;
}
}
