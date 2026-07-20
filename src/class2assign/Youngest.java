package class2assign;

import java.util.Scanner;

public class Youngest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rani's age");
		int rani_age=sc.nextInt();
		System.out.println("enter raghu's age");
		int Raghu_age=sc.nextInt();
		System.out.println("enter raju's age");
		int raju_age=sc.nextInt();
		System.out.println(p3(rani_age,Raghu_age,raju_age));
	}

	public static int p3(int rani_age, int Raghu_age, int raju_age) {
		int youngest=0;
		if(rani_age< Raghu_age && Raghu_age < raju_age) {
			youngest=rani_age;
		}
		else if(Raghu_age<raju_age && raju_age<rani_age) {
			youngest=Raghu_age;
		}
		else {
			youngest=raju_age;
		}
		return youngest;
		
	}
}
