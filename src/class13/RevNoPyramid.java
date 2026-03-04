package class13;

public class RevNoPyramid {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
			if(i%2==1) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
			}
			else {
					for(int j=i;j>=1;j--) {
						System.out.print(j+" ");
					}
				}
			System.out.println();
			}
		
		}
	}


//    1 
//   2 1 
//  1 2 3 
// 4 3 2 1 
//1 2 3 4 5 
