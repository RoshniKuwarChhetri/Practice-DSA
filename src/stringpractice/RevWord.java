package stringpractice;

public class RevWord {
public static void main(String[] args) {
	System.out.println(p("sky is blue"));
}
public static String p(String s) {
    String word = "";
    String rev = "";

    for (int i = 0; i < s.length(); i++) {   
//    	blue is sky
    	
//    for (int i = s.length()-1; i >=0 ; i--) {  
//    	yks si eulb
        char c = s.charAt(i);

        if (c != ' ') {
            word = word + c;  
//            word = c + word;   eulb si yks
        } else {
            rev = word + " " + rev;  // ✅ add at front
            word = "";
        }
    }

    // last word
    rev = word + " " + rev;

    return rev.trim();  // remove extra space
}
}
