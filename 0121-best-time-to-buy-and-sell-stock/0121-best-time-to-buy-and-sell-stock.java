class Solution {
    public int maxProfit(int[] prices) {
        int buy=-1,sell=-1,profit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){

            if(buy==-1 || prices[i]<prices[buy]){
                buy=i;
                sell=-1;
            }

            if(sell==-1 || prices[i]>prices[sell]){
                sell=i;
                profit=Math.max(profit,prices[sell]-prices[buy]);
            }
        }
        return profit;
    }
}