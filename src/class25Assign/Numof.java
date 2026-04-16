package class25Assign;

public class Numof {
public static void main(String[] args) {
	System.out.println(p("00000ggggg55555%%%%%"));
}
public static String p(String s) {
	int alpha=0;
	int digit=0;
	int special=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if((c>='A' && c<='Z') ||(c>='a' && c<='z')) {
			alpha++;
		}
		else if(c>='0' && c<='9') {
			digit++;
		}
		else {
			special++;
		}
	}
	return "alphabet: "+ alpha +" digit: " +digit+ " special characters: "+ special;
}
}
