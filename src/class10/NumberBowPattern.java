package class10;

public class NumberBowPattern {
	public static void main(String[] args) {
		
	int n=5;
  for(int i=1;i<=n;i++) {
	  for(int j=1;j<=n;j++) {
		 if(i==j || i+j==n+1||j==1 ||j==5 ) {
			 System.out.print(j+" ");
		 }
		 else {
			  System.out.print("  ");
		  }
	  }
	 System.out.println();
  }
}
}
//1       5 
//1 2   4 5 
//1   3   5 
//1 2   4 5 
//1       5 
