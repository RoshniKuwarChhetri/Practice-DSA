package practice6;

import java.util.Arrays;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s="Roshni Kuwar Chhetri";
		System.out.println(p(s));
		
		
	}
  public static String p(String s) {
	  char arr[]=s.toCharArray();
	  Arrays.sort(arr);
	  int j=0;
	  for(int i=1;i<arr.length;i++) {
		  if(arr[j] !=arr[i]) {
			  j++;
			  arr[j] =arr[i];
		  }
	  }
	  return new String(arr,0,j+1);
  }
}
