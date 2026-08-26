class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int j=0,c=0,len=Integer.MAX_VALUE;
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')
                c++;

            while(c>k || (c==k && s.charAt(j)=='0')){
                if(s.charAt(j)=='1')
                    c--;
                j++;    
            }

            if(c==k && len>i-j+1){
                x=j;
                y=i;
                len=i-j+1;
            }

            if(c==k && len==i-j+1){
                if(update(x,y,j,i,s)){
                    x=j;
                    y=i;
                }
            }
        }

        if(len==Integer.MAX_VALUE)
            return "";

        return s.substring(x,y+1);
    }
    private boolean update(int x,int y,int i,int j,String s){

        for(int k=0;k<y-x+1;k++){
            if(s.charAt(i+k)<s.charAt(x+k))
                return true;
            else if(s.charAt(i+k)>s.charAt(x+k))
                return false;
        }

        return false;
    }
}