package class38;
import java.util.Arrays;
public class MergSortAlgo {
	    public static void mergeSort(int[] arr, int low, int high) {
	        if (low >= high) {
	        return;
	        }
	            int mid = low + (high - low) / 2;

	            mergeSort(arr, low, mid);       // sort left half 
	            mergeSort(arr, mid + 1, high);  // sort right half 
	            merge(arr, low, mid, high);     // merge both halves 
	        
	    }

	    public static void merge(int[] arr, int low, int mid, int high) {
	        int[] temp = new int[high - low + 1];

	        int i = low;      // left part
	        int j = mid + 1;  // right part
	        int k = 0;

	        while (i <= mid && j <= high) {
	            if (arr[i] <= arr[j]) {
	                temp[k] = arr[i];
	                i++;
	            } else {
	                temp[k] = arr[j];
	                j++;
	            }
	            k++;
	        }

	        while (i <= mid) {
	            temp[k] = arr[i];
	            i++;
	            k++;
	        }

	        while (j <= high) {
	            temp[k] = arr[j];
	            j++;
	            k++;
	        }

	        for (int p = 0; p < temp.length; p++) {
	            arr[low + p] = temp[p];
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {-3,-2,-1,-6,0,-4,-2};

	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println(Arrays.toString(arr));
	    }
	}

