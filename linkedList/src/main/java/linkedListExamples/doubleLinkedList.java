package linkedListExamples;

public class doubleLinkedList {

    DLLNode list;
    int length =0;

    public doubleLinkedList() {
        list = new DLLNode(1);
        DLLNode l2 = new DLLNode(2);
        DLLNode l3 = new DLLNode(3);
        DLLNode l4 = new DLLNode(4);

        l4.setNextNode(null);
        l4.setPreviousNode(l3);
        l3.setNextNode(l4);
        l3.setPreviousNode(l2);
        l2.setNextNode(l3);
        l2.setPreviousNode(list);
        list.setNextNode(l2);

    }

    public void addStartNode(DLLNode nNode){
        printDllList(list);
    }

    public void printDllList(DLLNode nNode){
        DLLNode currNode = nNode;
        while (currNode != null){
            System.out.println(currNode.getData());
            currNode=currNode.getNextNode();
        }
    }
    public static void main (String [] args){
        doubleLinkedList dll = new doubleLinkedList();
        DLLNode addNode = new DLLNode(100);
        dll.addStartNode(addNode);
    }
}
