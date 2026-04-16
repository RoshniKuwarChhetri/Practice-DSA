package class24;

public class Removetheduplicate {
	public static void main(String[] args) {
		
	}

	public static String p(String s) {
		int hash[]=new int[256];
		for(int i=0;i<=s.length();i++) {
			char c= s.charAt(i);
			if(c!=' ') {
				hash[c]++;
			}
		}
		for(int i=0;i<hash.length-1;i++) {
			
		}
		
		return "";
	}
}
