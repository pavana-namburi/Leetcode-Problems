/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr=head;
        HashSet<ListNode> hm=new HashSet<>();
        while(curr!=null){
            if(hm.contains(curr))
                return true;
            hm.add(curr);
            curr=curr.next;
        }
        return false;
    }
}