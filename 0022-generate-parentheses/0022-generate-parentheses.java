class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> al=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        compute(0,0,n,al,sb);
        return al;
    }
    private void compute(int o,int c,int n,List<String> al,StringBuilder sb){
        if(o==n && c==n)
            al.add(sb.toString());
        
        if(o<n){
            sb.append("(");
            compute(o+1,c,n,al,sb);
            sb.deleteCharAt(sb.length()-1);
        }        
        if(c<n && c<o){
            sb.append(")");
            compute(o,c+1,n,al,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}