package practiceSet2;

public class PermudationOfString {
public static void main(String[] args) {
p("hello","");
}
public static void p(String s,String ans) {
	if(s.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		String remain=s.substring(0,i)+s.substring(i+1);
		p(remain,ans+ch);
	}
}
}
