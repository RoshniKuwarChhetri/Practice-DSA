package practice4;
import java.util.Arrays;
public class PrefixSum {
public static void main(String[] args) {
	int arr1 []= {1,2,3};
	System.out.println(Arrays.toString(prefix(arr1)));
}

   static int[] prefix(int arr[]) {
	   
	   int pre[]=new int[arr.length];
	   pre[0]=arr[0];
	   for(int i=1;i<arr.length;i++) {
		   pre[i]=pre[i-1]+arr[i];
	   }
	   return pre;
   }
}
