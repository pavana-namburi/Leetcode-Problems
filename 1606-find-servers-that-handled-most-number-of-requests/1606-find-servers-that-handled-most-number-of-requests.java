class pair{
    int s,t;
    pair(int s,int t){
        this.s=s;
        this.t=t;
    }
}

class Solution {
    public List<Integer> busiestServers(int k, int[] a, int[] load) {
        
        PriorityQueue<pair> busy=new PriorityQueue<>((p,q)->Integer.compare(p.t,q.t));
        TreeSet<Integer> free=new TreeSet<>();

        for(int i=0;i<k;i++)
            free.add(i);

        int n = a.length;
        int handle[]=new int[k];

        for(int i=0;i<n;i++){
            while(!busy.isEmpty() && busy.peek().t<=a[i]){
                free.add(busy.poll().s);
            }

            if(busy.size()==k)
                continue;

            Integer choosen = free.ceiling(i%k);
            if(choosen==null)
                choosen=free.ceiling(0);

            free.remove(choosen);
            busy.add(new pair(choosen,a[i]+load[i]));
            handle[choosen]++;
        }

        int max=Arrays.stream(handle).max().orElse(handle[0]);
        List<Integer> res=new ArrayList<>();

        for(int i=0;i<k;i++){
            if(handle[i]==max)
                res.add(i);
        }

        return res;

    }
}