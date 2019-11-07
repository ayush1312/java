package linkedListRevisited;

public class linkedList {

    private Node head;

    public void addFront(Integer data){
        if (head == null){
            head= new Node(data);
        }else{
            Node tmpNode = new Node(data);
            tmpNode.setNextNode(head);
            head=tmpNode;
        }
    }

    public void findMiddleNode(){
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr.getNextNode() != null && fastPtr.getNextNode().getNextNode() !=null){
            slowPtr=slowPtr.getNextNode();
            fastPtr=fastPtr.getNextNode().getNextNode();
        }
        System.out.println(slowPtr.getData());
    }

    public void printList(){
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.getData());
            tmp=tmp.getNextNode();
        }
    }
}
