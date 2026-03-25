package class6assignment;

public class SeriesPrimeNumber {
public static void main(String[] args) {
    int start =10;
     int end=100;
     for(int j=start;j<=end;j++) {
	     int n=j;
	     //checking prime
	     int count=0;
	     for(int i=1;i<=n;i++) {
	    	 if(n%i==0) {
	    		 count++;
	    	 }
	    	 }
	    	 if(count==2) {
	    		 System.out.println(n);
	    	 }
	     }
     }
}

//space-O()
//time(n^2)