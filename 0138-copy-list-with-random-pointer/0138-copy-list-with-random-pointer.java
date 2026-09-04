/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        HashMap<Node,Node> hm=new HashMap<>();
        Node res=new Node(0);
        Node t=res;
        int i=0;

        while(curr!=null){
            Node temp=new Node(curr.val);
            t.next=temp;
            t=t.next;
            hm.put(curr,temp);
            i++;
            curr=curr.next;
        }

        curr=head;t=res.next;
        while(curr!=null){
            if(curr.random==null)
                t.random=null;
            else
                t.random=hm.get(curr.random);
            
            curr=curr.next;
            t=t.next;
        }

        return res.next;
    }
}