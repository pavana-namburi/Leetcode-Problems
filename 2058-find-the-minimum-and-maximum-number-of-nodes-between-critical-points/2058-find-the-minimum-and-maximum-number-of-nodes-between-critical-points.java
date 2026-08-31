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
        ListNode curr=head;
        int prev=-1,cnt=0,st=-1,pc=-1;
        int res[]=new int[2];
        res[0]=Integer.MAX_VALUE;

        while(curr!=null){
            cnt++;
            if(prev!=-1 && curr.next!=null){
                if(prev>curr.val && curr.val<curr.next.val){
                    if(st==-1){
                        st=cnt;
                        pc=cnt;
                    }
                    else{
                        res[0]=Math.min(res[0],cnt-pc);
                        pc=cnt;
                    }
                }
                else if(prev<curr.val && curr.val>curr.next.val){
                    if(st==-1){
                        st=cnt;
                        pc=cnt;
                    }
                    else{
                        res[0]=Math.min(res[0],cnt-pc);
                        pc=cnt;
                    }
                }
            }
            prev=curr.val;
            curr=curr.next;
        }
        if(pc==st || st==-1)
            return new int[]{-1,-1};
        res[1]=pc-st;
        return res;
    }
}