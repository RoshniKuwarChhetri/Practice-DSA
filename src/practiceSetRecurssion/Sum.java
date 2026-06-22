package practiceSetRecurssion;

public class Sum {
	public static void main(String[] args) {
		System.out.println(p(92));
	}
public static int p(int n) {
	if(n==0) {
	return n;	
	}
	
	return n%10 + p(n/10);
}
}
