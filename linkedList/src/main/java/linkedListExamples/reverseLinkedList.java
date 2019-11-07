package linkedListExamples;

public class reverseLinkedList {

    public static void main (String [] args){
        linkedList newList = new linkedList();
        newList.addStartNode(100);
        newList.addEndNode(200);
        newList.addEndNode(300);
        newList.addEndNode(400);
        newList.addEndNode(500);
        newList.addEndNode(600);
        newList.printList();
        reverseLinkedList rll = new reverseLinkedList();
        newList.setHead(rll.reverseList(newList.getHead()));
        System.out.println("*******After Reverse*********");
        newList.printList();
    }

    private Node reverseList(Node head){
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null){
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current=next;
        }
        return previous;
    }
}
