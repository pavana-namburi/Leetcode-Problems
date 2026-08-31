/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode curr=head;
        int prev=-1,cnt=0;
        while(curr!=null){
            cnt++;
            if(prev!=-1 && curr.next!=null){
                if(prev>curr.val && curr.val<curr.next.val)
                    al.add(cnt);
                else if(prev<curr.val && curr.val>curr.next.val)
                    al.add(cnt);
            }
            prev=curr.val;
            curr=curr.next;
        }
        int n=al.size();
        if(n<2)
            return new int[]{-1,-1};

        int res[]=new int[2];
        Collections.sort(al);
        res[0]=al.get(1)-al.get(0);
        for(int i=2;i<n;i++){
            res[0]=Math.min(res[0],al.get(i)-al.get(i-1));
        }
        res[1]=al.get(n-1)-al.get(0);
        return res;
    }
}