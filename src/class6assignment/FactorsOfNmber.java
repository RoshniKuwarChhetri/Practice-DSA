package class6assignment;

public class FactorsOfNmber {
       public static void main(String[] args) {
		
	       int n=12;
    	   int factorial=0;
    	   
//    	   for(int i=1;i<=n;i++) {
//    		   if(n%i==0) {
//    			   System.out.println(i);
//    		   }
    	   //optimization
    	   for(int i=1;i<=n/2;i++) {
    		   if(n%i==0) {
    			   System.out.println(i);
    		   }
    		  
    	   
    	     
       }

}
}
//time complexity--O(n)
//space complexity--O(1)