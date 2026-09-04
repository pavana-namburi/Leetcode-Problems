/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        LinkedHashSet<ListNode> hs1=new LinkedHashSet<>();
        LinkedHashSet<ListNode> hs2=new LinkedHashSet<>();

        while(headA!=null){
            hs1.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            hs2.add(headB);
            headB=headB.next;
        }

        hs1.retainAll(hs2);
        System.out.println(hs1);
        if(hs1.size()==0)
            return null;
        return hs1.getFirst();
    }
}