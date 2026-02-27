package class12;

public class HollowPyramidPattern {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==i||j==1||i==n) {
			System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();		
	}
}
}
