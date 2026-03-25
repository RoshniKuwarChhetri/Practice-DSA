package class19;

public class MoveZeroToTheEnd {
  public static void main(String[] args) {
   //position for non zero
	  int arr[]= {1,0,9,0,9,7,0,11,11,22};
	  int j=0;
	  int n=arr.length;
	  for(int i=0;i<n;i++) {
		  if(arr[i]!=0) {
			  int temp=arr[j];
			  arr[j]=arr[i];
			  arr[i]=temp;
			  j++;
		  }
	  }
    for(int a:arr) {
    	System.out.println(a);
    }
  }
}
