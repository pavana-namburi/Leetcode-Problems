class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(divisible(n,t))
                return n;
            n++;
        }
    }
    private boolean divisible(int n,int t){
        int p=1;
        while(n>0){
            p*=(n%10);
            n/=10;
        }
        return p%t==0;
    }
}