package linkedListRevisited;

public class executeLinkedList {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        LinkedList ll1 = new LinkedList();
        ll.addNode(5);
        ll1.addNode(4);
        ll.addNode(3);
        ll1.addNode(2);
        ll.addNode(1);
        //ll.printNode();
       // ll.reverseList();
        //ll.printNode();
        //System.out.println(ll.midList());
       // ll.deleteMid();
        //ll.printNode();
        //ll.addone();
        //ll.sumseperatedbyZero();
        //ll.duplicateRemoval();
        //ll.findNthNode(4);
        //ll.printNode();
        //ll1.printNode();
        ll.mergeList(ll.head,ll1.head);
        ll.printNode();
    }
}
