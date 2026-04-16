package class28;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {-1,0,2,-2,3,-4,5,6,-7,-1,0,1,2};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {         
            for (int j = i; j < arr.length; j++) {     
                int sum = 0;

                for (int k = i; k <= j; k++) {         
                    sum = sum + arr[k];                	
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println( max);
    }
}