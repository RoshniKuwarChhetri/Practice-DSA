package practiceString;

public class ReverseWordOrder {
public static void main(String[] args) {
	System.out.println(rev("hello Roshni"));
}
public static String rev(String s) {
 String word="";
 String rev="";
  for(int i=0;i<s.length();i++) {
	  char c=s.charAt(i);
	  if(c!=' ') {
		  word=word+c;
	  }else {
	  rev=word+ rev;
	  
	  word="";}
	
  }
  rev=word+ rev;
  return rev;
 
}

}
