package Programmers_Exam;

import java.util.Random;

public class StockPrice_main {

	public static void main(String[] args) {
		int[] prices = new int[100000];
		StockPrice sp = new StockPrice();
		
		for(int i=2; i<prices.length; i++){
			Random r = new Random(i);
			prices[i] = r.nextInt(i);
			System.out.println(prices[i]);
			System.out.println(sp.stockMoney(prices));
		}

	}

}
