class Solution {
    public int buyChoco(int[] prices, int money) {
        int amount=0;
        int min=0;
        Arrays.sort(prices);
        int firstmin=prices[0];
        int secondmin=prices[1];
        int sum=firstmin+secondmin;
        int req=sum-money;
        if(money>=sum) return Math.abs(req);
        return money;
    }
}