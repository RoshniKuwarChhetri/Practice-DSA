package practiceString;

public class ReverseEntireString {
public static void main(String[] args) {
	System.out.println(Rev("hello Roshni"));
}
 public static String Rev(String s) {
	// String word="";
	 String rev="";
	 char arr []=s.toCharArray();
	 for(int i=arr.length-1;i>=0;i--) {
		 rev=rev+arr[i];
	 }
	 return rev;
 }
}
