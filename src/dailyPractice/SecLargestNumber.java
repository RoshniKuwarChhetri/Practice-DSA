package dailyPractice;

public class SecLargestNumber {
public static void main(String[] args) {
	int arr []= {1,2,3,5};
	System.out.println(p(arr));
}
public static int p(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i:arr) {
		if(i>max) {
			max=i;
		}
	}
	return max;
}
}
