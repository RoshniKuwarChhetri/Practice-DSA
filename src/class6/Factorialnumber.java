package class6;

public class Factorialnumber {
	public static void main(String[] args) {
		System.out.println(p(4));
	}
	public static int p(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
				
	}

}
