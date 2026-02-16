package class1assign;

public class LeapYear {
  public static void main(String[] args) {
	System.out.println(leapYear(2025));
}
  
  public static String leapYear(int year) {
	  String result="";
	  if(year%4==0 && year%100!=0) {
		  result="leap year";
	  }
	  
	  else if(year%400==0) {
		  result="leap year";
	  }
	  else {
		  result ="not leap year";
	  }
	  return result;
  }
}
