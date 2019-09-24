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

    private void printList(Node nList){
        Node currentNode;
        currentNode = nList;
        while (currentNode != null){
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNextNode();
        }
    }

    public static void main (String []args){
        transverseLinkedList l1= new transverseLinkedList();
        Node nList = l1.createList();
        l1.printList(nList);
    }
}
