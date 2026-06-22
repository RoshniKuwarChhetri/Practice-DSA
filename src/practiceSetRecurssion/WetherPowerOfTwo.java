package practiceSetRecurssion;

public class WetherPowerOfTwo {
public static void main(String[] args) {
	System.out.println(p(9));
}
public static boolean p(int n) {
	if(n<=0) {
		return false;
	}
	
	return (n&(n-1))==0;
}
}
