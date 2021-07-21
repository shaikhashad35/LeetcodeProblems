package com.company;

public class BestTimeToSellStock122 {
    public int maxProfit(int[] prices) {
        //prices = [7,1,5,3,6,4]
        //Output: 7
        int sum=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                sum+=prices[i+1]-prices[i];
            }
        }
        return sum;
    }
}
