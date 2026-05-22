package practice7.patterns;

public class PatternImpo {
	public static void main(String[] args) {
		int n=3;
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x*(x+1)+" ");
				x++;
			}
			System.out.println();
		}
	}

}
//2 
//6 12 
//20 30 42 