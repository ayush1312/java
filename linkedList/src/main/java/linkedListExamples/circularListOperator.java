package linkedListExamples;

public class circularListOperator {
    public static void main (String []args){
        circularList cr = new circularList();
        cr.addStartNode(1);
        cr.addStartNode(2);
        cr.addStartNode(3);
        cr.addEndNode(4);
        //cr.deleteLastNode();
        //cr.deleteFirstNode();
        cr.removeDataElement(4);
        cr.printList();
    }
}
