package dailyPractice;

public class Anagram {
public static void main(String[] args) {
	System.out.println(p("pop","ppo"));
}
public static boolean p(String s1, String s2) {
	boolean anagram=false;
	char arr1[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	if(	(p2(arr2).equals(p2(arr1)))){
		anagram= true;
	}
return anagram;
	
}
public static String p2(char arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				char temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		
	}
	return new String(arr);
	
}
}
