package class4Assign;

import java.util.Scanner;

public class CinimaBooking {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("welcome");
	System.out.println("select 1 for 2d ");
	System.out.println("select 2 for 3d ");
	System.out.print("enter here :");
	int screan_type=sc.nextInt();
	
	System.out.println("select 1 for regular ");
	System.out.println("select 2 for primium ");
	System.out.println("select 3 for recliner ");
	System.out.print("enter here :");
	int seat_type= sc.nextInt();
	
	System.out.print("enter day :");
	String day=sc.next();
	
	System.out.println(p5(screan_type, seat_type, day));
	
}
   public static double p5(int screan_type, int seat_type ,String day) {
	  // double base_price=0;
	   double final_price=0;
	   switch(screan_type){
	   case 1:
	       switch(seat_type) {
	       case 1:
	    	   final_price=150;
	    	   break;
	       case 2:
	    	   final_price=250;
	    	   break;
	       case 3:
	    	   final_price=400;
	    	   break;
	    	 default:
	    		 System.out.println("no such seat type");
	    		 break;
	       }
	       break;
	   case 2:
		   switch(seat_type) {
		   case 1:
			   final_price=200;
			   break;
		   case 2:
			   final_price=300;
			   break;
		   case 3:
			   final_price=450;
			   break;
			default:
				System.out.println("no such seat type");
				break;
		   }
		   break;
		default:
			System.out.println("no such screen type");
	       
	   }
	   if(day.equals("sunday")|| day.equals("saturday") ){
		   final_price=final_price+50;
	   }
	   else {
		   final_price=final_price;
	   }
	   return final_price;
   }
  
}
