package linkedListExamples;

public class circularList {

    private Integer length = 0;
    private Node tail;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    void addStartNode(Integer data){
        Node tmp = new Node(data);
        if (tail == null){
            tail=tmp;
            tail.setNextNode(tail);
        } else{
            tmp.setNextNode(tail.getNextNode());
            tail.setNextNode(tmp);
        }
         length++;
    }

    void addEndNode(Integer data){
         addStartNode(data);
         tail=tail.getNextNode();
        length++;
    }

    void deleteLastNode(){
         Node currNode = tail.getNextNode();
         Node tmp = null;
         while (tail != currNode.getNextNode()){
             tmp=currNode;
             currNode=currNode.getNextNode();
         }
         tmp.setNextNode(tail);
         currNode.setData(null);
         currNode.setNextNode(null);
        length--;
    }

    void deleteFirstNode (){
        Node currNode = tail.getNextNode();
        Node tmp = null;
        while (tail != currNode){
            tmp=currNode;
            currNode=currNode.getNextNode();
        }
        tmp.setNextNode(tail.getNextNode());
        tail = tmp;
        currNode.setData(null);
        currNode.setNextNode(null);
        length--;
    }

    void removeDataElement(Integer data){
         Node currNode = tail.getNextNode();
         Node tmp = null;
         while (tail != currNode){
             if (currNode.getNextNode().getData().equals(data)){
                 currNode.setNextNode(currNode.getNextNode().getNextNode());
                 break;
             }else if (currNode.getData().equals(data)){
                 tail.setNextNode(currNode.getNextNode());
                 break;
             }else if(tail.getData().equals(data)){
                 deleteFirstNode ();
             }
             currNode=currNode.getNextNode();
         }
    }

    void printList(){
         Node currNode=tail.getNextNode();
         while(tail != currNode){
             System.out.println(currNode.getData());
             currNode=currNode.getNextNode();
         }
        System.out.println(tail.getData());
    }
}
