package linkedListRevisited;

public class ReverseKNode {
    public static Node reverseNode(Node head,int k){
        Node curr=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=reverseNode(next,k);
        }
        return prev;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addNode(9);
        ll.addNode(8);
        ll.addNode(7);
        ll.addNode(6);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        //ll.printNode();
       ll.head= reverseNode(ll.head,4);
       ll.printNode();
    }
}
