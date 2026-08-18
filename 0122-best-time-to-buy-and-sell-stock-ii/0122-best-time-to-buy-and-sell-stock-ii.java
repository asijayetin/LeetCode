class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=1;i<n;i++){
            minprice=Math.min(prices[i],minprice);
            int profit=prices[i]-minprice;
            if(profit>0){
                maxprofit+=profit;
                minprice=prices[i];
            }

        }
        return maxprofit;
    }
}