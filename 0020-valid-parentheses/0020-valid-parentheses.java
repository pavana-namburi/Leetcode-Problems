class Solution {
    public boolean isValid(String s) {
       Stack<Character> d=new Stack<>();
       d.push('0');
       for(char i:s.toCharArray()){
            char t=d.peek();
            if(i=='(' || i=='{' || i=='[')
                d.push(i);
            else if(i==')'&& t=='(')
                d.pop();
            else if(i=='}'&& t=='{')
                d.pop();
            else if(i==']'&& t=='[')
                d.pop();
            else
                return false;
       } 
       return d.peek()=='0'?true:false;
    }
}