package Class3;

public class Discount1 {
	public static void main(String[] args) {
		int age=88;
		double total_price=345678;
		double discount;
		double final_price; 
		double additional_discount=0;
		double price_after_discount=total_price;
		if(age>=13 && age<19) {
			discount=total_price*.05;
			 price_after_discount=total_price-discount;
			if(price_after_discount>5000) {
				 additional_discount=price_after_discount*.5;
				final_price=price_after_discount-additional_discount;
			}
			else {
				final_price=price_after_discount;
			}
			
		}
		else if(age>=20 && age<=29) {
			 discount=total_price*.06;
			 price_after_discount=total_price-discount;
			 if(price_after_discount>4000){
				additional_discount=price_after_discount*.06;
				final_price=price_after_discount-additional_discount;
				
			 }
			 else {
				 final_price=price_after_discount;
			 }
			 
		}
		else {
			discount=total_price*.15;
			final_price=total_price-discount;
		}
		
		System.out.println(total_price);
		System.out.println(price_after_discount);
		System.out.println(discount);
		
	}

}//diff bw method and function
