package class6assignment;

public class HCF {
	public static void main(String[] args) {
		System.out.println(p(11,112));
	}
public static int p(int a ,int b) {
	int result=0;
	if (a>b) {
		for(int i=1;i<=b;i++) {
			if(b%i==0 && a%i==0) {
				result= i;
			}
		}
	}
		else if(b>a) {
			for(int j=1;j<=a;j++) {
				if(a%j==0 && b%j==0) {
					result= j;
				}
			}
		}
		else {
			result =a;
		}
	return result;
}


}

//time complexity--O(n^2)
//space comlexity--O(1)
