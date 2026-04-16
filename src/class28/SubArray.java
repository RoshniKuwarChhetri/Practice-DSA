package class28;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {          // start index
            for (int j = i; j < arr.length; j++) {      // end index
                
                for (int k = i; k <= j; k++) {          // print subarray
                    System.out.print(arr[k] + ",");
                }
                
               System.out.println();
            }
        }
    }
}