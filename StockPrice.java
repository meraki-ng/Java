package Programmers_Exam;

import java.util.Random;

public class StockPrice {
	
	public double stockMoney(int[] prices){
		Random r = new Random(10000);
		 
		float time = System.currentTimeMillis();
		
		for(int i=2; i<prices.length; i++){
			prices[i] = r.nextInt(i);
			if(prices[i-1] != prices[i]){
			 return time;
				}
			}
		return 0;
	}
}
