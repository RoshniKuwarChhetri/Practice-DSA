package class25Assign;

public class Lower {
	public static void main(String[] args) {
		System.out.println(p("QWERTYbbOffffffffffg   IUYT"));
	}
  public static String p(String s) {
	  char arr[]=s.toCharArray();
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]>='A'&&arr[i]<='Z' ) {
		  arr[i]=(char)(arr[i]+32);}
	  }
	  String result= new String(arr);
	  return result;
  }
}
