package practiceSet2;

public class Anagram {
public static void main(String[] args) {
	System.out.println(p("listen","silent"));
}
public static boolean p(String s1, String s2) {
	char arr[]=new char[26];
	
	for(int i=0;i<s1.length();i++) {
	
		arr[s1.charAt(i)-'a']++;
		arr[s2.charAt(i)-'a']--;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i] !=0) {
			return false;
		}
	}
	return true;
}
}
