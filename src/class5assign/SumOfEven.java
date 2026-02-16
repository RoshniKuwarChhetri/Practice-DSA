package class5assign;

public class SumOfEven {
  public static void main(String[] args) {
	System.out.println(p(11));
}
  public static int p(int n) {
	  
	  int sum=0;
	  while(n>0) {
		  int last=n%10;
		  if(last%2==0) {
			  sum+=last;
		  }
		  else {
			  sum=sum;
		  }
		  n=n/10;
	  }
	  return sum;
  }
}
