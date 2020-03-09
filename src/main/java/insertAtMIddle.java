public class insertAtMIddle {
    Node head;
    Node mid;
    int count =0;
   class Node{
        int data;
        Node next;
    }

    public void insertMid(int n){
        Node tmp = new Node();
        tmp.data=n;
        tmp.next=null;
        if(count<2){
            if (head==null){
                head=tmp;

            }else {
                head.next = tmp;
            }
            count++;
            mid=head;
        }else{
            tmp.next=mid.next;
            mid.next=tmp;
            count++;
            if(count %2 != 0) mid = mid.next;
        }
    }

    void show()
    {

        Node temp;

        temp = head;

        // Initializing temp to head
        // Iterating and printing till
        // The end of linked list
        // That is, till temp is null
        while (temp != null)
        {

            System.out.print( temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print( "null");
        System.out.println();
    }

    public static void main(String args[])
    {
        // Elements to be inserted one after another
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        insertAtMIddle L1=new insertAtMIddle();

        // Insert the elements
        for (int i = 0; i < n; i++)
            L1.insertMid(arr[i]);

        // Print the nodes of the linked list
        L1.show();
    }
}

