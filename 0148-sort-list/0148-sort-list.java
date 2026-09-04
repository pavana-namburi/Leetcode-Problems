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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null,s=head,f=head;

        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }

        prev.next=null;
        head=sortList(head);
        s=sortList(s);

        return merge(head,s);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode res=new ListNode();
        ListNode d=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                d.next=l1;
                l1=l1.next;
            }
            else{
                d.next=l2;
                l2=l2.next;
            }
            d=d.next;
        }

        if(l1!=null)
            d.next=l1;
        
        if(l2!=null)
            d.next=l2;

        return res.next;
    }
}