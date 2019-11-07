package linkedListExamples_old;

public class linkedListNthFromEnd {
    public static void main (String [] args){
        linkedList newList = new linkedList();
        newList.addStartNode(1);
        newList.addEndNode(2);
        newList.addEndNode(3);
        newList.addEndNode(4);
        newList.addEndNode(5);
        newList.addEndNode(6);
        //newList.printList();
        Integer pos=newList.getLength();
        Node n= newList.findNthNode(newList.getHead(),pos);
        System.out.println(n.getData());
    }
}
