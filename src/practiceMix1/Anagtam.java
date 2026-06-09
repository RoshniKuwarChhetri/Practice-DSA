package practiceMix1;

public class Anagtam {
public static void main(String[] args) {
	p("pop0","ppo");
}
   public static void p(String s1, String s2) {
	  
	   char arr1[]=s1.toCharArray();
	   char arr2[]=s2.toCharArray();
	   
	   for(int i=0;i<arr1.length;i++) {
		   for(int j=0;j<arr1.length-i-1;j++) {
			   if(arr1[j]>arr1[j+1]) {
				   char temp= arr1[j];
				   arr1[j]=arr1[j+1];
				   arr1[j+1]=temp;
			   }
		   }
		   
	   }
	   for(int i=0;i<arr2.length;i++) {
		   for(int j=0;j<arr2.length-i-1;j++) {
			   if(arr2[j]>arr2[j+1]) {
				   char temp= arr2[j];
				   arr2[j]=arr2[j+1];
				   arr2[j+1]=temp;
			   }
		   }
		   
	   }
	   
	   String str1=new String(arr1);
	   String str2=new String(arr2);
	   if(str1.equals(str2)) {
		   System.out.println("anagram");
	   }else {
		   System.out.println("not an anagram");
	   }
	  
}
   
}


//1 3 + 5 3 +3 3=153