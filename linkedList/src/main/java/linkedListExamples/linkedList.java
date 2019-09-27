package linkedListExamples;

public class linkedList {
    int length = 0;
    Node list;
    public  linkedList(){
        list = new Node(1);
        Node l1 = new Node(2);
        Node l2 = new Node(3);
        l1.setNextNode(l2);
        list.setNextNode(l1);
        length = 3;
    }

    public void addStartNode(Node nNode){
        nNode.setNextNode(list);
        list=nNode;
        length++;
        //printNode(list);
    }

    public void addEndNode(Node nNode){
        Node lastNode=findLastNode(list);
        lastNode.setNextNode(nNode);
        length++;
        printNode(list);
    }

    public Node findLastNode(Node nNode){
        Node lastNode=nNode;
        Node currNode=nNode;
         while(currNode !=null){
             lastNode=currNode;
             currNode=currNode.getNextNode();
         }
        return lastNode;
    }

    public void printNode(Node nNode){
        Node currNode = nNode;
        while(currNode!=null){
            System.out.println(currNode.getData());
            currNode=currNode.getNextNode();
        }
    }

    public static void main(String []args){
        Node n1 = new Node (10);
        Node n2 = new Node (100);
        linkedList newList = new linkedList();
        newList.addStartNode(n1);
        newList.addEndNode(n2);
    }
}
