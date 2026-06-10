package practiceMix1;

public class DigitSum {
public static void main(String[] args) {
	System.out.println(p(123));
}
public static int p(int n) {
	if(n==0) 
		return 0;
	

	return (n%10) +p(n/10);
}
}
