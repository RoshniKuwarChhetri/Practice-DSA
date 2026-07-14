package dailyPractice;

public class StringReverse {
   public static void main(String[] args) {
	System.out.println(p("roshni"));
}
   public static String p(String s) {
	   int start=0;
	   int end=s.length()-1;
	   char arr[]= s.toCharArray();
	   
	   while(start<end) {
		   char temp= arr[start];
		   arr[start]=arr[end];
		   arr[end]=temp;
		   start++;
		   end--;
	   }
	   return new String(arr);
	   }
  
	   
   }

