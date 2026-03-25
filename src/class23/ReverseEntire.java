package class23;

public class ReverseEntire {
    public static void main(String[] args) {
		System.out.println(reverse("hello everyone"));
	}
    public static String reverse(String s) {
    	String word="";
    	String rev="";
    	for(int i=s.length()-1;i>=0;i--) {
    		char c=s.charAt(i);
    		if(c!=' ') {
    			word=word+c;
    		}
    		else {
    			word=word+c;
    			rev=word+rev;
    			rev="";
    		}
    		
    		
    	}
    	rev=word+rev;
    	return rev;
    }
}
