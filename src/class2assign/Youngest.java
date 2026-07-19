package class2assign;

import java.util.Scanner;

public class Youngest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter raghav's age");
		int raghav_age=sc.nextInt();
		System.out.println("enter raghu's age");
		int Raghu_age=sc.nextInt();
		System.out.println("enter raju's age");
		int raju_age=sc.nextInt();
		System.out.println(p3(raghav_age,Raghu_age,raju_age));
	}

	public static int p3(int raghav_age, int Raghu_age, int raju_age) {
		int youngest=0;
		if(raghav_age< Raghu_age && Raghu_age < raju_age) {
			youngest=raghav_age;
		}
		else if(Raghu_age<raju_age && raju_age<raghav_age) {
			youngest=Raghu_age;
		}
		else {
			youngest=raju_age;
		}
		return youngest;
		
	}
}
