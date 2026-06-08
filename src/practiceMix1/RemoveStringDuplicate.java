package practiceMix1;

public class RemoveStringDuplicate {
public static void main(String[] args) {
	System.out.println(p("hello"));
}
  public static String p(String s) {
	String result="";
	for(int i=0;i<s.length();i++) {
	
		char c=s.charAt(i);
		if(result.indexOf(c)==-1) {
			result=result+c;
		}
		
	}
	return result;
}
}
