package practiceSetStackAndQueue;

import java.util.Stack;

public class ValidParanthesis {
public static void main(String[] args) {
	System.out.println(p("{{{{{}}}}[[[)))"));
}
	public static boolean p(String s) {
		Stack<Character> st=new Stack<>();
		for(char c:s.toCharArray()) {
			if (c=='(') {
				st.push(')');
			}
			else if (c=='{') {
				st.push('}');
			}
			else if (c=='[') {
				st.push(']');
			}
			
			else if(st.isEmpty() || st.pop()!=c) {
				return false;
			}
			
		}
		return st.isEmpty();
	}
}
