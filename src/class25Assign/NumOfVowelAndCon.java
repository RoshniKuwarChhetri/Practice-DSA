package class25Assign;

public class NumOfVowelAndCon {
	public static void main(String[] args) {
		   System.out.println(p("AeiOurrr"));
	}
	public static String p(String s) {
		int vowel=0;
		int conso=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' ||c=='i' ||c=='o' || c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ) {
				vowel++;
			}
			else {
				conso++;
			}
		}
				return " count of vowel : "+vowel+" count of consonent : "+ conso;
	}

}
