package class25Assign;

public class Upper {
public static void main(String[] args) {
	System.out.println(p("asdfghwert3456SDFjk"));
}
   public static String p(String s) {
	   char c[]=s.toCharArray();
	   for(int i=0;i<c.length;i++) {
		   if(c[i]>='a' && c[i]<='z') {
			   c[i]=(char)(c[i]-32);
		   }
		  
	   }
	   String result=new String (c);
	   return result ;
   }
   
}
