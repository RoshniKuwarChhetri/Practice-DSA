package practice7.patterns;

public class DiamondPattern {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int k1=1;k1<=i;k1++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i ; j++) {
                System.out.print("* ");
            }

			System.out.println();
			
		}
		
	}

}

//   *
//  ***
// *****
//*******
// *****
//  ***
//   *