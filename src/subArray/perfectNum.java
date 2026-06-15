package subArray;

public class perfectNum {
public static void main(String[] args) {
	System.out.println(p(6));
}

public static boolean p(int n) {
int sum=0;
for(int i=1;i<n;i++) {
	if(n%i==0) {
		sum=sum+i;
	}
}
return sum==n;
}
}
