package practiceSetRecurssion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(p(3));
	}
public static int p(int num) {
	if(num<=1) {
		return 1;
	}
	return num*p(num-1);
}
}
