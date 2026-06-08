package practiceMix1;

public class FibonacciRecursion {
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		System.out.println(p(i));
	}
}
public static int p(int n) {
	if(n==1 || n==0) {
		return n;
	}
	else {
		return p(n-1) + p(n-2);
	}
}
}

