class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long common=Math.min(need1,need2);
        long res=Math.min(common*costBoth,common*(cost1+cost2));

        if(need1>common){
            long rem=need1-common;
            res+=Math.min(rem*costBoth,rem*cost1);
        }
        
        if(need2>common){
            long rem=need2-common;
            res+=Math.min(rem*costBoth,rem*cost2);
        }

        return res;
    }
}