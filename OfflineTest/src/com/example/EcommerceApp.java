package com.example;

public class EcommerceApp {
	
	static void display(int[] arr){
		System.out.print("Discount :{");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.print("}");
	}
	public static void main(String[] args) {
		int prices[]= {8,9,6,10,3};
		int discount[]=new int[prices.length];
		
		for(int i=0;i<prices.length;i++) {
			int curr=prices[i];
			int finalDiscount=prices[i];
			
			for(int j=i+1;j<prices.length;j++) {
				int temp=prices[j];
				if(curr>temp) {
					finalDiscount=curr-temp;
					break;
				}
			}
			discount[i]=finalDiscount;
		}
		display(prices);
		display(discount);
		
	}

}
