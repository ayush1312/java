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
        newList.printList();

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
            removeLoop(oneStep,ll.getHead());
        }else{
            System.out.println("loop not found");
        }
    }

    private void removeLoop(Node curr,Node head){
        Node tmp = head;
        Node loopDetect=curr;
        while(tmp!=curr){
            loopDetect=curr;
            tmp=tmp.getNextNode();
            curr=curr.getNextNode();
        }
        loopDetect.setNextNode(null);
    }
}
