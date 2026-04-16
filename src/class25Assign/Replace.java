package class25Assign;

public class Replace {
public static void main(String[] args) {
	System.out.println(p("aaaaaaiiii99999zzzzAAAAaaaaa"));
}
 public static String p(String s) {
	  char c[]=s.toCharArray();
	  for(int i=0;i<c.length;i++) {
		  if(c[i]=='a') {
			  c[i]='z';
		  }
	  }
	  String s2= new String(c);
	 return s2;
 }
}
