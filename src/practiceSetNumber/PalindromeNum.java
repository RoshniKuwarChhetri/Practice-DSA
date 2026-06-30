package practiceSetNumber;

public class PalindromeNum {
public static void main(String[] args) {
	System.out.println(p(121));
}
public static boolean p(int n) {
	int n2=n;
	int rev=0;
	while(n>0) {
		int dig=n%10;
		rev=rev*10+dig;
		n=n/10;
	}
	return rev==n2;
}
}
