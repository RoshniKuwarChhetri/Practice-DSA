package class25Assign;

public class DivideString {
	public static void main(String[] args) {
		
 String s="Roshni KC";
	  int i=0;
	  String s1="";
	  String s2="";
	  while(i<s.length() && s.charAt(i)!=' ') {
		  s1=s1+s.charAt(i);
	  }
	  i++;
	  while(i<s.length()) {
		  s2=s2+s.charAt(i);
	  }
	  System.out.println(s1);
	  System.out.println(s2);
  }
}
