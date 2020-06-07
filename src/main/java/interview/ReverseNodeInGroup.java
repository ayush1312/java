package interview;

public class ReverseNodeInGroup {

    public static Node reverseNode(Node head,int count){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        int counter=0;
        boolean flip=true;
        while (currNode !=null && counter<count){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
            counter++;
        }
        if(head != null) head.next=currNode;
        while(counter!=0 && currNode != null){
            currNode=currNode.next;
            counter--;
        }
        if (currNode!=null) currNode.next=reverseNode(currNode.next,count);
        return prevNode;
    }

    public static void main(String[] args) {
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
        Node n = reverseNode(ll.head,3);
        LinkedList ll1 = new LinkedList();
        ll1.head=n;
        ll1.printNode();
    }
}
