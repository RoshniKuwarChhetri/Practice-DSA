package practiceSetString;

public class StringReverse {
public static void main(String[] args) {
	System.out.println(p("roshni"));
}
public static String p(String s) {
	char arr[]=s.toCharArray();
	int i=0;
	int j = arr.length-1;
	while(i<=j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
		i++;
		j--;
		
	}
	String rev=new String(arr);
	return rev;
}
}
