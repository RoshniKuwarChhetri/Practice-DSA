package class8;

public class NthFibonacciSeries {

	public static void main(String[] args) {
		System.out.println(fib(4));
	}
	public static int fib(int k) {
		int n1=0;
		int n2=1;
		int i=1;
		
		while(i<k) {
			int n3=n1+n2;
			n1=n2;
			 n2=n3;	
			 i++;
		}
		return n1;
	}
}
