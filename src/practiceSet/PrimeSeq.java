package practiceSet;

public class PrimeSeq {
	public static void main(String[] args) {
		p(1,100);
	}
	public static void p(int start,int end ) {
	
		for(int i=start;i<=end;i++) {		
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
				
			}
			if(count==1) {
				System.out.println(i);
			}
		}
	}

}
