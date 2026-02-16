package class1assign;

public class PositiveNegative {
  public static void main(String[] args) {
	System.out.println(posNeg(-0));
}
  
  public static String posNeg(int n) {
	  
      String result="";
	  if(n>0) {
		  result="positive";
  }
	  else if(n==-0){
		  result="invalid number";
	  }
	  else {
		  result="negative";
	  }
	  return result;
  }
}
