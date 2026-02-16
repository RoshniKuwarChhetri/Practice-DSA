package class4Assign;

import java.util.Scanner;

public class OnlineFoodOrdering {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("wecome!!!");
	System.out.println("Please Select the restaurant");
	System.out.println("Select 1 for South Indian");
	System.out.println("Select 2 for North Indian");
	System.out.println("Select 3 for Chinese");
	int rest=sc.nextInt();
	
	switch(rest){
	case 1:
		
		System.out.println("Select 1 for Idli");
		System.out.println("Select 2 for Dosa");
		int order = sc.nextInt();
	     switch(order) {
	     case 1:
	    	 System.out.println("Idly will be delivered shortly");
	    	 break;
	     case 2:
	    	 System.out.println("Dosa will be delivered shortly");
	    	 break;
	     default:
	       System.out.println("no such dish");
	       break;
	     }
	     break;
		
	case 2:
		System.out.println("select 1 for roti");
		System.out.println("select 2 for paneer");
		int order2 = sc.nextInt();
	    switch(order2) {
	    case 1:
	    	System.out.println("roti will be delivered shortly");
	    	break;
	    case 2:
	    	System.out.println("paneer will be delivered shortly");
	    	break;
	    default:
		       System.out.println("no such dish");
		       break;
	    }
	    break;
	case 3:
		System.out.println("select 1 for Noodle");
		System.out.println("select 2 for manchurian");
		int order3 = sc.nextInt();
		switch(order3) {
		case 1:
			System.out.println("Noodles will be delivered shortly");
			break;
		case 2:
			System.out.println("Manchurian will be delivered shortly");
			break;
		default:
		       System.out.println("no such dish");
		       break;
		}
		break;
		
		default :
			System.out.println("no such Restaurant available");
			break;
	}
	
}
	
}
