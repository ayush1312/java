package linkedListExamples;

public class linkedList {
   private Integer length = 0;
   private Node head;


     void addStartNode(Integer data){
        
        Node tmp = new Node(data);
        if (head == null){
            head = tmp;
        }else {
            tmp.setNextNode(head);
            head=tmp;
        }
        length++;
        //printNode(head);
    }

     void addEndNode(Integer data){
        
        Node tmp = new Node(data);
        if(head == null){
            head = tmp;
        }else {
            Node lastNode = findLastNode(head);
            lastNode.setNextNode(tmp);
        }
        length++;
        //printNode(head);
    }

     void addMidNode(Integer data,Integer position){
        Node tmp = new Node(data);
        if (head == null){
            head=tmp;
        }else {
            Node midnode = findNthNode(head, position);
            tmp.setNextNode(midnode.getNextNode());
            midnode.setNextNode(tmp);
        }
        //printNode(head);
    }

     void removeFirstNode(){
        Node currNode;
        currNode=head;
        if (currNode != null){
            head=currNode.getNextNode();
            currNode.setNextNode(null);
            //printNode(head);
        }

    }

     void removeLastNode(){
        Node tmp = head;
        while (tmp.getNextNode().getNextNode() != null){
            tmp=tmp.getNextNode();
        }
        tmp.setNextNode(null);
        //printNode(head);

    }

     void removeNthNode(Integer position){
        Node midnode = findNthNode(head,position);
        midnode.setNextNode(midnode.getNextNode().getNextNode());
        //printNode(head);
    }

     private Node findLastNode(Node nNode){
        Node lastNode=nNode;
        Node currNode=nNode;
         while(currNode !=null){
             lastNode=currNode;
             currNode=currNode.getNextNode();
         }
        return lastNode;
    }

      private Node findNthNode(Node nNode,Integer position){
        Node currNode=nNode;
        Node tmp = null;
        if (position>length) position = length;
        if (position<0) position=0;
        Integer currposition =0;
        while(currNode !=null){
            if(currposition.equals(position)){
                return tmp;
            }
            currposition++;
            tmp=currNode;
            currNode=currNode.getNextNode();
        }
        return new Node(999);
    }

     void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.println(currNode.getData());
            currNode=currNode.getNextNode();
        }
    }
    
}
