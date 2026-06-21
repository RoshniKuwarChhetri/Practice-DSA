package practiceSetArray;

public class MergeSortedArray {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5};
		p(a,b);
		
	}

	public static void p(int arr1[],int arr2[]) {
		int [] arr3=new int [arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else {
				arr3[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			arr3[k++]=arr1[i++];	
		}
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];	
		}
		for(int a:arr3) {
			System.out.println(a);
		}
		}
	
}
