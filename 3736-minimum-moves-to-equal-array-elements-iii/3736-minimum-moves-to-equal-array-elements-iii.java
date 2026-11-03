class Solution {
    public int minMoves(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(arr[0]);
        int res=0;

        for(int x:arr){
            res+=(max-x);
        }

        return res;
    }
}