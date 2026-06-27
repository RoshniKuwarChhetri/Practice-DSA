package practiceSetSubStringSet;

public class OccuranceofExist {
	public static void main(String[] args) {
		System.out.println(p("roshni","ro"));
	}

	public static int p(String s,String sub) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(s.substring(i,j).equals(sub)) {
					count++;
				}
			}
		}
		return count;
	}
}
