package com.example.blind;

//2
public class Maxprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {

		int profit = 0;
		
		for(int i = 0; i < prices.length;i++) {
			
			
			for(int j = i+1; j<prices.length;j++) {
				
				if(prices[j] - prices[i]>profit) {
					profit = prices[j] - prices[i];
				}
			}	
		}
		
		return profit;
    }
	
	public int maxProfit1(int[] prices) {

		int profit = 0;
		int buy = prices[0];
		
		for(int i = 1; i < prices.length;i++) {
			if(prices[i] < buy) {
				buy = prices[i]; 
			}
			else {
				
				if((prices[i] - buy) > profit) {
					profit = prices[i] - buy ;
				}
			}
				
		}
		
		return profit;
    }


}
