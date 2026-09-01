class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length(),i=0,res=0,max=0;
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int j=0;j<n;j++){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            max=Math.max(max,hm.get(s.charAt(j)));

            while((j-i+1)-max>k){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0)
                    hm.remove(s.charAt(i));
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}