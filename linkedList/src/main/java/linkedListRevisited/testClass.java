package linkedListRevisited;

public class testClass {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        ll.printNode();
        rotateByKpos(ll,2);
    }

    static void rotateByKpos(LinkedList ll, Integer k){
        Node n = ll.head;
        int size =0;
        while(n.next!=null){
            size++;
            n=n.next;
        }
        size++;
        if (size>k) {
            Node curr = ll.head;
            //int pos = size-k;
            int count =1;
            while (count < k){
                curr = curr.next;
                count++;
            }
            n.next=ll.head;
            ll.head=curr.next;
            curr.next=null;
        }
        ll.printNode();
        System.out.println("****"+size);
    }
}
