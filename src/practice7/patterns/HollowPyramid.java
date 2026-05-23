package practice7.patterns;

public class HollowPyramid {
 public static void main(String[] args) {
	int n=5;
	for(int i =0;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==j || j==1 || i==n) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
