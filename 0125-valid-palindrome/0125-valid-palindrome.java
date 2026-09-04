class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i))
                sb.append(i);
        }
        String s1=sb.toString();
        String s2=sb.reverse().toString();
        return s1.equals(s2);
    }
}