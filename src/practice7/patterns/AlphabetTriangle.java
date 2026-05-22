package practice7.patterns;

public class AlphabetTriangle {
public static void main(String[] args) {
	int n='D';
		for(char i='A';i<=n;i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
}
}

//A
//A B
//A B C
//A B C D