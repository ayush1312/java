package linkedListRevisited;

public class IntersectionOfLinkedList {
    public static void findNode(Node a, Node b) {
        int countA = 0;
        int countB = 0;
        int nodedata;
        Node tA=a;
        Node tB=b;
        while (tA != null) {
            countA++;
            tA=tA.next;
        }
        while (tB != null) {
            countB++;
            tB = tB.next;
        }
        int diff = countA - countB;
        if (diff > 0) {
            while (diff > 0) {
                a = a.next;
                diff--;
            }
        } else {
            while (diff < 0) {
                b = b.next;
                diff++;
            }
        }
        while (a.next != null) {
            if (a.next == b.next) {
                nodedata = a.next.data;
                System.out.println(nodedata);
                break;
            }
        }
    }
    public static void main (String []args){
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();

        // creating first linked list
        list.head = new Node(3);
        list.head.next = new Node(6);
        list.head.next.next = new Node(9);
        list.head.next.next.next = new Node(15);
        list.head.next.next.next.next = new Node(30);

        // creating second linked list
        list1.head = new Node(10);
        list1.head.next = list.head.next.next.next;
        findNode(list.head,list1.head);
    }
}