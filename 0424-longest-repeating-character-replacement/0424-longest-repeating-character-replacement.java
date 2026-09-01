class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length(),i=0,res=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int j=0;j<n;j++){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while(!valid(hm,k)){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0)
                    hm.remove(s.charAt(i));
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
    private boolean valid(HashMap<Character,Integer> hm,int k){
        int n=hm.size(),max=0,sum=0;
        for(char x:hm.keySet()){
            max=Math.max(max,hm.get(x));
            sum+=hm.get(x);
        }
        return (sum-max)<=k;
    }
}