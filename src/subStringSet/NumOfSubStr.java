package subStringSet;

public class NumOfSubStr {
public static void main(String[] args) {
	p("Roshni");
}
public static void p(String str) {
	int count =0;
	String string;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			str.substring(i,j);
			count++;
			
		}
	}
	System.out.print(count);
}
}
