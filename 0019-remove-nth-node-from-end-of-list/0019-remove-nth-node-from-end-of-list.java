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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head,prev=null;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int t=c-n+1;
        if(t==1)
            return head.next;
        c=1;
        curr=head;
        while(c<t){
            c++;
            prev=curr;
            curr=curr.next;
        }
        if(curr.next==null)
            prev.next=null;
        else
            prev.next=curr.next;
        return head;
    }
}