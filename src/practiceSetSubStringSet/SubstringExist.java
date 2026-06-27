package practiceSetSubStringSet;

public class SubstringExist {
	public static void main(String[] args) {
		System.out.println(p("roshni"));
	}
public static boolean p(String s) {
	
	String sub;
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
			if(s.substring(i,j).contains("ro")){
			return true;
		}
	}
	
}
	return false;
}
}
