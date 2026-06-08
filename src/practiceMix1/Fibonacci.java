package practiceMix1;

public class Fibonacci {
public static void main(String[] args) {
	p(7);
}
public static void p(int n) {
	int n1=0;
	int n2=1;
	
		for(int i=3;i<=n;i++) {
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		}
	
}
}
