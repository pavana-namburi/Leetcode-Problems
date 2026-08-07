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
 class pair{
    int i;
    ListNode curr;
    pair(int j,ListNode c){
        i=j;
        curr=c;
    }
    public String toString(){
        return i+" "+curr;
    }
 }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.i-b.i);
        ListNode ans=new ListNode();
        ListNode res=ans;
        int n=lists.length;
        for(int i=0;i<n;i++){
            if(lists[i]!=null)
                pq.add(new pair(lists[i].val,lists[i]));
        }
        while(!pq.isEmpty()){
            pair p=pq.poll();
            res.next=new ListNode(p.i);
            res=res.next;
            if(p.curr.next!=null){
                pq.add(new pair(p.curr.next.val,p.curr.next));
            }
        }
        return ans.next;
    }
}