package class29;

public class StringCompression {
public static void main(String[] args) {
	String str="aabbaccdda";
	int count=1;
	String result="";
	
	for(int i=1;i<=str.length();i++) {
		if(i<str.length() && str.charAt(i)==str.charAt(i-1)  ) {
			count++;
		}
		else {
			result=result+str.charAt(i-1)+count;
			count=1;
		}
	}
	System.out.println(result);
}
}
