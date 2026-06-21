package practiceSetArray;

public class MissingNum {
public static void main(String[] args) {
	int arr []= {1,2,4,5};
	int sum=0;
	int n=arr.length +1;
	for(int i:arr) {
		sum=sum+i;
	}
	int sum2=n*(n+1)/2;
	
	int num=sum2-sum;
	System.out.println(num);
}

}
