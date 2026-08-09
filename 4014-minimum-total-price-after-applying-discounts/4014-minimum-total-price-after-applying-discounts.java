class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double minprice=0;
        int j = discounts.length - 1;
        for(int i=prices.length-1;i>=0;i--){
            if(j>=0){
                minprice+=prices[i]*(100-discounts[j])/100.00;
                j--;
            }
            else minprice+=prices[i];
        }
        return minprice;
        
    }
}