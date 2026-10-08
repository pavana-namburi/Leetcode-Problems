class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        boolean is=false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!is &&  s.charAt(i)=='(')
                is=true;
            else if(is &&  s.charAt(i)=='('){
                sb.append(s.charAt(i));
                st.push(s.charAt(i));
            }
            else if(is &&  s.charAt(i)==')' && !st.isEmpty()){
                sb.append(s.charAt(i));
                st.pop();
            }
            else if(is &&  s.charAt(i)==')' && st.isEmpty()){
                is=false;
            }
        }
        return sb.toString();
    }
}