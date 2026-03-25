package class7;

public class NumOfFact {
	public static void main(String[] args) {
		System.out.println(p(12));
	}
	
	public static int p(int n) {
		int count=0;
	   int fact=0;
	   for(int i=1; i<=n/2;i++) {
		if(n%i==0) {
			count++;
		}
		
	}
	return count+1;
		
	}

}
//space-O(1)
//space-O(log n)