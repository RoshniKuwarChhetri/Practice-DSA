package class1assign;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age ");
		int age = sc.nextInt();
		System.out.println(p2(age));
	}
	
	public static String p2(int age) {
		String result="";
		if (age>=18) {
			result="eligible";
		}
		else {
			result="not eligible";
		}
		return result;
	}
}
