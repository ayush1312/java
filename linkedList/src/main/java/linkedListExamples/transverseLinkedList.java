package linkedListExamples;

public class transverseLinkedList {
    private Node createList(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.setNextNode(n2);
        n2.setNextNode(n3);

        return n1;
    }

    private int printList(Node nList){
        Node currentNode;
        int length = 0;
        currentNode = nList;
        while (currentNode != null){
            length++;
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNextNode();
        }
        return length;
    }

    public static void main (String []args){
        transverseLinkedList l1= new transverseLinkedList();
        Node nList = l1.createList();
        int lenOfList = l1.printList(nList);
        System.out.println("length of list is : "+lenOfList);
    }
}
