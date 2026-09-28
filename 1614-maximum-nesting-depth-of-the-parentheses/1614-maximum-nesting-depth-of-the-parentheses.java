class Solution {
    public int maxDepth(String s) {
        int n=s.length(),c=0,ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                c++;
            else if(s.charAt(i)==')')
                c--;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}