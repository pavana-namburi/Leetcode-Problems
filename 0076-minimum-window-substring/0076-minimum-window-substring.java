class Solution {
    public String minWindow(String s, String t) {

        int n=s.length(),m=t.length();
        if(m>n)
            return "";

        int ta[]=new int[26+26];
        int sa[]=new int[26+26];
        int j=0,res=Integer.MAX_VALUE;
        int mi=-1,mj=-1;

        for(char x:t.toCharArray()){
            if(Character.isLowerCase(x))
                ta[x-'a']++;
            else
                ta[x-'A'+26]++;
        }
        
        for(int i=0;i<n;i++){

            int y=-1;
            if(Character.isLowerCase(s.charAt(i)))
                y=s.charAt(i)-'a';
            else
                y=s.charAt(i)-'A'+26;
            
            sa[y]++;

            while(j<=i  && check(sa,ta)){
                if(res>i-j+1){
                    res=i-j+1;
                    mi=j;mj=i;
                }

                int z=-1;
                if(Character.isLowerCase(s.charAt(j)))
                    z=s.charAt(j)-'a';
                else
                    z=s.charAt(j)-'A'+26;
                sa[z]--;

                j++;
            }
        }

        if(mi==-1 && mj==-1)
            return "";

        return s.substring(mi,mj+1);
    }
    private boolean check(int sa[],int ta[]){

        for(int i=0;i<52;i++){
            if(sa[i]>=ta[i])
                continue;
            else
                return false;
        }
        return true;
    }
}