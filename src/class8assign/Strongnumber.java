package class8assign;

public class Strongnumber {
	public static void main(String[] args){
		System.out.println(p(140));
	}
public static boolean p(int n){
	int n1=n;
	int sum=0;
	while(n>0) {
		int last=n%10;
		int result=1;
		
		for(int i=1;i<=last;i++) {
			result= result*i;
		}
		sum=sum+result;
		n=n/10;
	}
	if(sum==n1) {
		return true;
	}
	return false;

}
}
