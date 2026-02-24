package class8assign;

public class Exponential {

	
	public static void main(String[] args) {
		System.out.println(p(2,3));
	}
	public static int p(int base,int expo) {
		int result=1;
		for(int i=1;i<=expo;i++) {
			result=result*base;
		}
		return result;
	}
}

