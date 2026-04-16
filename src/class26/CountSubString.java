package class26;

public class CountSubString{
public static void main(String[] args) {
	
	String s="hello";
	 int count =0;
	for(int i =0;i<s.length();i++) {
		String word="";
		
		for(int j=i;j<s.length();j++) {
			 word = word+s.charAt(j);
			 count++;
			//System.out.println(word);
			
		}
		
	}
	 System.out.println(count);
}
}
