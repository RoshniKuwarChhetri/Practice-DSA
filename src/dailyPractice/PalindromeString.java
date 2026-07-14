package dailyPractice;

public class PalindromeString {
public static void main(String[] args) {
	System.out.println(p("pod"));
}
public static boolean p(String s) {
	String s1=s;
	int start =0;
	int end=s.length()-1;
	char arr[]=s.toCharArray();
	while(start<end) {
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	return s1.equals(new String (arr));
}
}
