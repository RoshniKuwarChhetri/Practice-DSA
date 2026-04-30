package string;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(p("pop"));
	}
	public static String p(String s) {
		String s2=s;
		char arr[]=s.toCharArray();
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			char temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		String rev=new String(arr);
				if(rev.equals(s2)) {
					return "valid palindrome";
				}
		
		return "invalid palindrome";
	}

}
