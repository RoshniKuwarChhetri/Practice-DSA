package class8;

public class StrongNumber {
	public static void main(String[] args) {

		int n=145;
		int sum=0;
		// int fact=1;
		 int n1=n;
		while(n>0) {
			int digit=n%10;	
			int fact=1;
			    for(int i=digit;i>=1;i--) {
		     	fact=fact*i;
			     }	
		sum=sum+fact;
		n=n/10;	
		}		
		if(n1==sum) {			
			System.out.println("strong number");
			
				}else {
					
		System.out.println("not");
		}
	}

}

//armstrong number
//expomential of given number withpout using inbild
