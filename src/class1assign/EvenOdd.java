package class1assign;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println(evenOdd(5));
	}
   public static String  evenOdd(int n){
	   String result="";
	   if(n%2==0) {
		   result= "even";
	   }
	   else {
		   result="odd";
	   }
	   return result;
   }
}
