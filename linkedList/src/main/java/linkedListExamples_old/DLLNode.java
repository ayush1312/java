package linkedListExamples_old;

public class DLLNode {
    private Integer data;
    private DLLNode previousNode;
    private DLLNode nextNode;

    public DLLNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DLLNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DLLNode previousNode) {
        this.previousNode = previousNode;
    }

    public DLLNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DLLNode nextNode) {
        this.nextNode = nextNode;
    }
}
