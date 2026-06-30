package practiceSetNumber;

public class Count {
public static void main(String[] args) {
	System.out.println(p(100));
}
public static int p(int n) {
	int count=0;
	while(n>0) {
	n=n/10;
		count++;
	}
	return count;
}
}
