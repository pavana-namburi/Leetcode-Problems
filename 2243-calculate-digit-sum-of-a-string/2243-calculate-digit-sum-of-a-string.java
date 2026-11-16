class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            s=process(s,k,s.length());
        }
        return s;
    }
    private String process(String s,int k,int n){
        int i=0,cnt=0,sum=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            if(cnt==k){
                cnt=0;
                sb.append(sum);
                sum=0;
            }
            sum+=(s.charAt(i)-'0');
            cnt++;
            i++;
        }
        if(cnt!=0)
            sb.append(sum);
        return sb.toString();
    }
}