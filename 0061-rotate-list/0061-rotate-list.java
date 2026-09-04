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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p=head,ln=null,par=null;
        if(head==null)
            return head;

        int n=0;
        while(p!=null){
            n++;
            ln=p;
            p=p.next;
        }

        k=k%n;
        if(k==0)    
            return head;
        k=(n-k);
        p=head;
        while(k>0){
            par=p;
            p=p.next;
            k--;
        }
        
        par.next=null;
        ln.next=head;
        return p;
    }
}