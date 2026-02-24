package class8assign;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(p(153));
	}
 public static boolean p( int n) {
	int n1=n;
	
	int count=0;
	int sum=0;
	while(n>0) {
		count++;	
		n=n/10;}
	
	//find power and sum
		while(n>0) {
			int digit=n1%10;
			int result=1;
		
		for(int i=1;i<=count;i++) {
			result=result*digit;
		}
		sum=sum+result;
			
	 if(n1==sum) {
		 return true;
	 }
		}
		return false;
		}}