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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        int n=al.size(),i=1;
        while(curr!=null){
            curr.val=al.get(n-i);
            curr=curr.next;
            i++;
        }
        return head;
    }
}