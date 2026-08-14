class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length(),res=0,j=0;

        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            while(hm.get(s.charAt(i))>2){
                hm.put(s.charAt(j),hm.get(s.charAt(j))-1);

                if(hm.get(s.charAt(j))==0)
                    hm.remove(s.charAt(j));

                j++;
            }

            res=Math.max(res,i-j+1);
        }

        return res;
    }
}