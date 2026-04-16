package class37;

public class ReverseString {
	static String reverse(String str, int index) { 
        if (index < 0) {
            return "";
        }
        return str.charAt(index) + reverse(str, index - 1);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str, str.length() - 1));
    }
	
}
