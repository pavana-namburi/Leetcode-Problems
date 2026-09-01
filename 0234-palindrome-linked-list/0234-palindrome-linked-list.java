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
    public boolean isPalindrome(ListNode head) {
        ListNode f=head,s=head;
        int len=0;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            len+=2;
            if(f!=null && f.next==null)
                len++;
        }
        ListNode h2=s,h1=head;
        if(len%2==1)
            h2=h2.next;
        h2=reverse(h2);
        while(h2!=null){
            if(h1.val!=h2.val)
                return false;
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
        }
        return prev;
    }
}