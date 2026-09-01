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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
            return null;
        else if(head.next==null)
            return null;
    
        ListNode curr=head,prev=null;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int n=len/2;
        
        curr=head;
        while(n>0){
            prev=curr;
            curr=curr.next;
            n--;
        }
        if(prev==null)
            return curr.next;
        prev.next=curr.next;
        return head;
    }
}