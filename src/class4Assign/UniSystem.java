package class4Assign;

import java.util.Scanner;

public class UniSystem {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Wellcome");
		 System.out.println("Enterv 1 for CSE");
		 System.out.println("Enter 2 for ECE ");
		 System.out.print("Enter your year here");
		 int dept = sc.nextInt();
		switch(dept) {
		case 1:
			System.out.println("Enter your year");
			int year= sc.nextInt();
			switch(year) {
			case 1:
				System.out.println("your subject is programming");
				break;
			case 2:
				System.out.println("your subject is DS");
			    break;
			case 3:
				System.out.println("your subject is DBMS");
				break;
			default:
				System.out.println("Invalid year entered");
			}
			break;
		case 2:
			System.out.print("Enter your year");
			int year2=sc.nextInt();
		    switch(year2) {
		    case 1:
		    	System.out.println("your subject is Circuits");
		    	break;
		    case 2:
		    	System.out.println("your subject is signals");
		    	break;
		    case 3:
		    	System.out.println("your subject is microprocesser");
		    	break;
		    default:
		    	System.out.println("invalid year entered");
		    }
		   break;
		   
		   default:
			   System.out.println("no such department number");
		       break;	
		}
	}

}
