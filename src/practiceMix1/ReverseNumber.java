package practiceMix1;

public class ReverseNumber {
public static void main(String[] args) {
	System.err.println(p(123));
}
public static int p(int n) {
	int rev=0;
	while (n>0) {
		int lDigit=n%10;
		rev=rev*10+lDigit;
		n=n/10;
	}
	return rev;
}
}
