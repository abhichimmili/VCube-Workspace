package dsa.others;

public class Stocks {
	
	static void stocks(int[] a) {
		int minPrice=a[0];
		int buyDay=0;
		int bestBuyDay=0;
		int maxProfit=a[0]-minPrice;
		int sellDay=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<minPrice) {
				minPrice=a[i];
				buyDay=i;
			}
			int profit=a[i]-minPrice;
			if(profit>maxProfit) {
				maxProfit=profit;
				bestBuyDay = buyDay; 
				sellDay=i;
			}
		}
		System.out.println("Buy Day : "+bestBuyDay);
		System.out.println("Buy Price : "+a[bestBuyDay]);
		System.out.println("Sell Day : "+sellDay);
		System.out.println("Sell Price : " + a[sellDay]);
		System.out.println("Max Profit : "+maxProfit);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,2,10,5,13,1,7};
		stocks(arr);
	}

}
