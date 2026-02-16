package class4;

import java.util.Scanner;

public class PaymentMode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select catagory");
		System.out.println("enter 1 for Electronics ");
		System.out.println("enter 2 for Clothing ");
		
		System.out.print("Enter here : ");
		int pro_cate=sc.nextInt();
		
		System.out.println("select payment mode");
		System.out.println("enter 1 for UPI");
		System.out.println("enter 2 for Credit card");
		System.out.println("enter 3 for COD");
		
		System.out.print("Enter payment mode here : ");
		int payment_mode=sc.nextInt();
		System.out.println(p4( pro_cate, payment_mode));
		
	}

	public static double p4(int pro_cate, int payment_mode) {
		int MRP=6000;
		double final_price=0;
		int disount_amount=0;
		switch(pro_cate) {
		case 1:
			switch(payment_mode) {
			case 1:
				final_price=MRP-(MRP*0.05);
				break;
			case 2:
				final_price=MRP-(MRP*0.1);
				break;
			case 3:
				final_price=MRP;
				break;
			default :
			   System.out.println("no such paymeny mode");
			   break;
			}
			break;
			
			
		case 2:
			switch(payment_mode) {
			case 1:
				final_price=MRP-(MRP*0.1);
				break;
			case 2:
				final_price=MRP-(MRP*0.5);
				break;
			case 3:
				final_price=MRP+50;
				break;
			default :
				   System.out.println("no such paymeny mode");
				   break;
			}
			break;
		default:
			System.out.println("no such catagory");
			break;
		}
		return final_price;
	}
}
