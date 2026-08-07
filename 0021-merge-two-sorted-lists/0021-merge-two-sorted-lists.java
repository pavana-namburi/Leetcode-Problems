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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode res=new ListNode(),curr=res,l1=list1,l2=list2;
       while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=new ListNode(l1.val);
                curr=curr.next;
                l1=l1.next;
            }
            else{
                curr.next=new ListNode(l2.val);
                curr=curr.next;
                l2=l2.next;
            }
       }
       if(l1!=null)
            curr.next=l1;
        else if(l2!=null)
            curr.next=l2;
        return res.next;
    }
}