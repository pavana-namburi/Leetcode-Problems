class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-2;i++){
            if (i > 0 && a[i] == a[i - 1]) continue;
            int l=i+1,h=n-1;
            while(l<h){
                int s=a[i]+a[l]+a[h];
                if(s==0){
                    res.add(Arrays.asList(a[i],a[l],a[h]));
                    while(l<h && a[l]==a[l+1]) l++;
                    while(l<h && a[h]==a[h-1]) h--;
                    l++; h--;
                }
                else if(s<0){
                    l++;
                }
                else{
                    h--;
                }
            }
        }
        return res;
    }
}