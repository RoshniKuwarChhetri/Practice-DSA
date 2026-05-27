package practiceArray;

public class BestTimeToBuyAndSell {

public static int p(int price []) {
	if(price==null || price.length==0 ) {
		return 0;
	}
	int minPrice=price[0];
	int maxProfit=0;
	for(int i=1;i<price.length;i++) {
		int profit=price[i]-minPrice;
		
		if(profit>maxProfit) {
			maxProfit=profit;
		}
		
		if(price[i] <= minPrice) {
			minPrice=price[i];
		}
		
		
	}
	return maxProfit;
}

}
