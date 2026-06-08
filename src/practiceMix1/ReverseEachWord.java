package practiceMix1;

public class ReverseEachWord {
public static void main(String[] args) {
	System.out.println(p("i am roshni"));
}
  public static String p(String s) {
	  String word="";
	  String rev="";
	  for(int i=0;i<s.length();i++) {
		  char c=s.charAt(i);
		  if(c!=' ') {
			  word=c+word;
		  }else {
			  rev=rev+word+" ";
			  word="";
		  }
	  }
	  rev=rev+word+" ";
	  return rev.trim();
  }

}
