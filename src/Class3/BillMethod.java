package Class3;

public class BillMethod {
	public static double Bill(int unit){
		double bill=0;
		if(unit<=100) {
		      bill=unit*2;
			
		}
		else if(unit>100 && unit<=300) {
		       bill=100*2 +(unit-100)*4;
		}
		else {
			 bill=100*2+200*4+ (unit-300)*6;
		}
		
		
		
		if(bill>2000) {
			bill=bill+(bill*10);
		}
		return bill;
	}}


