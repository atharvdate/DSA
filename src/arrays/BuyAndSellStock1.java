package arrays;

public class BuyAndSellStock1 {
    public static int stockMarket(int[] prices){
        //initialize buying price and profit to use these vars across the program
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //todays profit
                maxProfit = Math.max(profit, maxProfit ); //overall maximum profit
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }


    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};

        System.out.println(stockMarket(prices));
    }
}
