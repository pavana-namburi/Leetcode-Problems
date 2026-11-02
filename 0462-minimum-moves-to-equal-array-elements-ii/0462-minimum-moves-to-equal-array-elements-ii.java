class Solution {
    public int minMoves2(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        int c=0,m=a[n/2];
        for(int i=0;i<n;i++){
            c+=Math.abs(a[i]-m);
        }
        return c;
    }
}