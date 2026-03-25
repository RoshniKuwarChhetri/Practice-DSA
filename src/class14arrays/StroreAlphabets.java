package class14arrays;

public class StroreAlphabets {
public static void main(String[] args) {
	char [] arr= new char[26];
   int index=0;
	for(char i='A';i<='Z';i++) {
		arr[index]=i;
		index++;
	}
	for(char x:arr) {
		System.out.println(x);
	}
}
}
//for characters
//arr[index]=i;
//index++;