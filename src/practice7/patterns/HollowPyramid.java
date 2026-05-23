package practice7.patterns;

public class HollowPyramid {
 public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int k=n;k>=1;k--) {
			System.out.print(" ");
		}
		for(int j=1;i<=i;j++) {
			if(i==j || i==n||j==1) {
              System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
