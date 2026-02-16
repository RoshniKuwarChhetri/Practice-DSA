package class5assign;

public class StartwithEvenOrOdd {
	public static void main(String[] args) {
		System.out.println(p(234));
	}
    public static String p(int n) {
    	String result;
    	int rev=0;
    	while(n>0) {
    		int last=n%10;
    		rev=rev*10+last;
    		n=n/10;
    	}
    	 int first=rev%10;
    	 if(first%2==0) {
    		 result="even";
    	 }
    	 else {
    		 result="odd";
    	 }
    	 
    	 return result;
    }
}
