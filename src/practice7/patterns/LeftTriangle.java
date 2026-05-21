package practice7.patterns;

public class LeftTriangle {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n-1;i++) {
			for(int k=0;k<=n-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		    System.out.println();
		}
	}

}
