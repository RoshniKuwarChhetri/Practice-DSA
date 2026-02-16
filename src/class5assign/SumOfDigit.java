package class5assign;

public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println(p(2277));
	}
  public static int p(int n) {
	  int sum=0;
	  
	  while(n>0) {
		int last=n%10;
		sum=sum+last;
		n=n/10;
		  
	  }
	  return sum;
  }
}
