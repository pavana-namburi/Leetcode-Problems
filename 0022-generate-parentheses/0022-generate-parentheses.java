class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generate(0,0,n,sb,res);
        return res;
    }
    private void generate(int o,int c,int n,StringBuilder sb,List<String> res){
        if(sb.length()==(2*n))
            res.add(sb.toString());

        if(o>=n && c>=n)
            return;
        
        if(o<n){
            sb.append("(");
            generate(o+1,c,n,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

        if(c<n && o>c){
            sb.append(")");
            generate(o,c+1,n,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}