package linkedListExamples;

public class addNodeSortedLinkedList {
    public static void main (String [] args){
        Integer datatoadd = 350;
        linkedList newList = new linkedList();
        newList.addStartNode(100);
        newList.addEndNode(200);
        newList.addEndNode(300);
        newList.addEndNode(400);
        newList.addEndNode(500);
        newList.addEndNode(600);
        //newList.printList();
        addNodeSortedLinkedList asn = new addNodeSortedLinkedList();
        Integer pos=asn.positionToAdd(datatoadd,newList);
        //newList.addMidNode(datatoadd,pos);
        newList.printList();
    }

    private Integer positionToAdd(Integer data,linkedList ll){
        Node tmp = ll.getHead();
        Node prevNode = ll.getHead();
        Integer position=0;
        while(tmp.getData()<=data){
            position++;
            prevNode = tmp;
            tmp=tmp.getNextNode();
        }
        Node newnode = new Node(data);
        newnode.setNextNode(prevNode.getNextNode());
        prevNode.setNextNode(newnode);
        return position;
    }
}
