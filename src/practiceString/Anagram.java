package practiceString;

public class Anagram {
public static void main(String[] args) {
	System.out.println(ana("listen", "silent"));
}
public static boolean ana(String s1, String s2) {
	char[] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=i+1; j<arr1.length ;j++) {
			while(arr1[i]>arr1[j]) {
				char temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr2.length;i++) {
		for(int j=i+1; j<arr2.length ;j++) {
			while(arr2[i]>arr2[j]) {
				char temp=arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=temp;
			}
		}
	}
	
	
	return( new String (arr1)).equals(new String (arr2));
}
}
