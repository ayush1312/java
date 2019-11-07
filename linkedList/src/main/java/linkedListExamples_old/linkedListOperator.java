package linkedListExamples_old;

public class linkedListOperator {

    public static void main(String []args){
        linkedList newList = new linkedList();
        newList.addStartNode(2);
        newList.addStartNode(1);
        newList.addEndNode(3);
        newList.addEndNode(4);
        newList.addEndNode(5);
        newList.addEndNode(6);
        newList.addMidNode(50,2);
        newList.addMidNode(100,3);
        newList.removeFirstNode();
        newList.removeLastNode();
        newList.removeNthNode(2);
        newList.printList();
    }
}
