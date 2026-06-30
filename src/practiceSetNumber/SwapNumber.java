package practiceSetNumber;

public class SwapNumber {
public static void main(String[] args) {
	System.out.println(p(1,2));
}
public static  String p(int n1,int n2) {
	int temp=n1;
	n1=n2;
	n2=temp;
	return "n1:"+n1 + " " + "n2:"+n2;
}
}
