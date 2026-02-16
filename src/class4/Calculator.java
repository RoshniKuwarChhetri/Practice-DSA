package class4;

public class Calculator {

	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		char operator='+';
		int res=0;
		switch(operator) {
		case '+' :
			res=add(a,b);
			break;
		case '-':
			res=sub(a,b);
			break;
		case '/':
			res=div(a,b);
			break;
		case '*':
			res= multi(a,b);
			break;
		case '%':
			res=mod(a,b);
			break;
		default:
			System.out.println("invalid operator");
		}
		
		System.out.println("Result :" + res);
		
	}
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	public static int sub(int n1, int n2) {
		return n1-n2;
	}
	public static int div(int n1, int n2) {
		return n1/n2;
	}
	public static int mod(int n1, int n2) {
		return n1%n2;
	}
	
	public static int multi(int n1, int n2) {
		return n1*n2;
	}
}
