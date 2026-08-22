class Solution {
    public List<Integer> findAnagrams(String s, String m) {
        int n=s.length(),p=m.length();
        List<Integer> al=new ArrayList<>();
        if(p>n)
            return al;
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<p;i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
            h2.put(m.charAt(i),h2.getOrDefault(m.charAt(i),0)+1);
        }
        if(h1.equals(h2))
            al.add(0);
        for(int i=p;i<n;i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
            h1.put(s.charAt(i-p),h1.get(s.charAt(i-p))-1);
            if(h1.get(s.charAt(i-p))==0)
                h1.remove(s.charAt(i-p));
            if(h1.equals(h2))
            al.add(i-p+1);
        }
        return al;
    }
}