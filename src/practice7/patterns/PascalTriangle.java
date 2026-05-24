package practice7.patterns;

public class PascalTriangle {
 public static void main(String[] args) {
	int n=4;
	for(int i=0;i<	n;i++) {
		int x=1;
		for(int j=0;j<=i;j++) {
			System.out.print(x+" ");
			x=x*(i-j)/(j+1);
		}
		System.out.println();
	}
}
}


//1
//1 1
//1 2 1
//1 3 3 1