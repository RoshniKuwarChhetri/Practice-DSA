package practiceMix1;

public class OccuranceCount {
public static void main(String[] args) {
	System.out.println(p("roshniaaa",'a'));
}
public static String p(String s,char c) {
	int count =0;
	for(char c1 :s.toCharArray()) {
		if(c1==c) {
			count++;
		}
	}
	return c+"->"+count;
			
}
}
