package linkedListExamples;

public class linkedList {
    int length = 0;
    Node list;
    public  linkedList(){
        list = new Node(1);
        Node l1 = new Node(2);
        Node l2 = new Node(3);
        Node l3 = new Node(4);
        l2.setNextNode(l3);
        l1.setNextNode(l2);
        list.setNextNode(l1);
        length = 4;
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

    public void addMidNode(Node nNode,int position){
        Node midnode = findNthNode(list,position);
        nNode.setNextNode(midnode.getNextNode());
        midnode.setNextNode(nNode);
       // list.setNextNode(midnode);
        printNode(list);
    }

    public void removeFirstNode(){
        Node currNode;
        currNode=list;
        if (currNode != null){
            list=currNode.getNextNode();
            currNode.setNextNode(null);
            printNode(list);
        }

    }

    public void removeLastNode(){
        Node tmp = list;
        while (tmp.getNextNode().getNextNode() != null){
            tmp=tmp.getNextNode();
        }
        tmp.setNextNode(null);
        printNode(list);

    }

    public void removeNthNode(int position){
        Node midnode = findNthNode(list,position);
        midnode.setNextNode(midnode.getNextNode().getNextNode());
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

    public Node findNthNode(Node nNode,int position){
        Node currNode=nNode;
        if (position>length) position = length;
        if (position<0) position=0;
        int currposition =0;
        while(currNode !=null){
            if(currposition==position){
                return currNode;
            }
            currposition++;
            currNode=currNode.getNextNode();
        }
        return new Node(999);
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
        Node n3 = new Node (50);
        linkedList newList = new linkedList();
        //newList.addStartNode(n1);
        //newList.addEndNode(n2);
        //newList.addMidNode(n3,2);
        //newList.removeFirstNode();
        //newList.removeLastNode();
        //newList.removeNthNode(1);
    }
}
