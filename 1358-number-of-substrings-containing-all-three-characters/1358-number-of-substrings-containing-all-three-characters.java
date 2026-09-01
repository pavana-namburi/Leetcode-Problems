class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int c=0,i=0,j=0;
        while(j<n){
            char t=s.charAt(j);
            hm.put(t,hm.getOrDefault(t,0)+1);
            while(hm.size()==3){
                c+=(n-j);
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0)
                    hm.remove(s.charAt(i));
                i++;
            }
           j++;
        }
        return c;
    }
}