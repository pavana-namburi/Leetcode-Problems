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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode curr = head, op = odd, ep = even;
        while (curr != null) {
            op.next = curr;
            ep.next = curr.next;
            op = op.next;
            ep = ep.next;
            if (curr.next != null) {
                curr = curr.next.next;
            }
            else
                curr = curr.next;
        }
        op.next = even.next;
        return odd.next;
    }
}