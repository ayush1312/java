package linkedListExamples;

public class checkLoopinLinkedList {

    public static void main (String [] args){
        linkedList newList = new linkedList();
        newList.addStartNode(100);
        newList.addEndNode(200);
        newList.addEndNode(300);
        newList.addEndNode(400);
        newList.addEndNode(500);
        newList.addEndNode(600);

        circularList cr = new circularList();
        cr.addStartNode(1);
        cr.addStartNode(2);
        cr.addStartNode(3);
        cr.addEndNode(4);
        //newList.printList();
        newList.addEndNode(cr.getTail());
        //newList.printList();
        checkLoopinLinkedList cll=new checkLoopinLinkedList();
        cll.findLoop(newList);
    }

    private void findLoop(linkedList ll){
        Node oneStep = ll .getHead();
        Node twoStep = ll.getHead();
        Boolean loopFound=false;

        while(twoStep != null){
            oneStep=oneStep.getNextNode();
            twoStep=twoStep.getNextNode().getNextNode();
            if (oneStep==twoStep){
                loopFound=true;
                break;
            }
        }
        if (loopFound){
            System.out.println("loop found");
        }else{
            System.out.println("loop not found");
        }
    }
}
