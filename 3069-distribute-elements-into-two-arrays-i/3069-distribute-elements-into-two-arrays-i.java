class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int res[]=new int[n];

        int i=2,x=1,y=1,k=0;
        a.add(nums[0]);
        b.add(nums[1]);
        while(i<n){
            if(a.get(x-1)>b.get(y-1)){
                a.add(nums[i++]);
                x++;
            }
            else{
                b.add(nums[i++]);
                y++;
            }
        }

        for(int m=0;m<x;m++){
            res[k++]=a.get(m);
        }

        for(int m=0;m<y;m++){
            res[k++]=b.get(m);
        }

        return res;
    }
}