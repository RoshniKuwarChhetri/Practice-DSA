package class14arrays;

public class BooleanValStore {
	public static void main(String[] args) {
		

 boolean arr[]=new boolean[26];
    for(int i=0;i<arr.length;i++) {
       if(i%2==0) {
    	   arr[i]=true;
       }
       else
    	   arr[i]=false;
    }
    for(boolean b: arr) {
    	System.out.println(b);
    }
}
}