package class5assign;

public class ProductOfDigit {
     public static void main(String[] args) {
		System.out.println(p(74));
	}
     public static int p(int n) {
    	 int product=1;
    	 while(n>0) {
    		 int last =n%10;
    		 product*=last;
    		 n=n/10;
    	 }
    	 return product;
     }
}
