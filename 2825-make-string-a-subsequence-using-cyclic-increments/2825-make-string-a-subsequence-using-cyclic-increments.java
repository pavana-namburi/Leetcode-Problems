class Solution {
    public boolean canMakeSubsequence(String a, String b) {
        int n=a.length(),m=b.length();
        int i=0,j=0;
        while(i<n && j<m){
            char c1=a.charAt(i);
            char nc1= (char)((((c1-'a')+1)%26)+'a');
            char c2=b.charAt(j);

            if(c2==c1 || nc1==c2){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return m==j;
    }
}