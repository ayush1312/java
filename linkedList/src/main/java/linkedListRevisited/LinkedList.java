package linkedListRevisited;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedList {
       Node head = null;

       public void addNode(int data){
           if (head==null){
               head=new Node(data);
           }else{
               Node tmp= new Node(data);
               tmp.next=head;
               head=tmp;
           }
       }

       public void reverseList(){
           Node previous =null;
           Node curr = null;
           while (head!=null){
               curr=new Node(head.data);
               curr.next=previous;
               previous=curr;
               head=head.next;
           }
           head=curr;
       }

       public int midList(){
           Node slowptr=head;
           Node fastptr=head;
           while(fastptr.next!=null && fastptr.next.next!=null){
               slowptr=slowptr.next;
               fastptr=fastptr.next.next;
           }
           return slowptr.data;
       }

       public void deleteMid(){
           Node slowptr=head;
           Node fastptr=head;
           Node previous=null;
           while(fastptr.next!=null && fastptr.next.next!=null){
               previous=slowptr;
               slowptr=slowptr.next;
               fastptr=fastptr.next.next;
           }
           if(fastptr.next!=null && fastptr.next.next==null) {
               slowptr.next = slowptr.next.next;
           }else{
               previous.next=slowptr.next;
           }
       }

       public void addone(){
           int sum=1;
           reverseList();
           Node curr=head;
           while(curr!=null){
               sum+=curr.data;
               curr.data=sum%10;
               sum=sum/10;
               curr=curr.next;
           }
           reverseList();
       }

       public void sumseperatedbyZero(){
           int sum=0;
           Node newlist= null;
           Node curr=head;
           while (curr!=null){
               if (curr.data!=0){
                   sum+=curr.data;
               }else{
                   if(newlist==null){
                       newlist= new Node(sum);
                   }else{
                       Node tmp=new Node(sum);
                       tmp.next=newlist;
                       newlist=tmp;
                   }
                   sum=0;
               }
               curr=curr.next;
           }
           if(newlist!=null && sum!=0){
               Node tmp=new Node(sum);
               tmp.next=newlist;
               newlist=tmp;
           }
           head=newlist;
       }

       public void duplicateRemoval(){
           Node curr=head;
           while(curr.next!=null){
               if(curr.data==curr.next.data) {
                   if(curr.next.next!=null) {
                       curr.next = curr.next.next;
                   }else{
                       curr.next=null;
                   }
               }else{
                   curr=curr.next;
               }
           }
       }

       public void findNthNode(int n){
           Node currNode=head;
           Node nthNode=head;
           int count=0;
           System.out.println("head Node value is "+head.data);
           while(currNode!=null){
               if (count>=n){
                   nthNode=nthNode.next;
               }
               currNode=currNode.next;
               count++;
           }
           System.out.println(n+"th Node value is "+nthNode.data);
       }

       public void mergeList(Node headN1,Node headN2){
           Node newNode=new Node(0);
           Node curr=newNode;
           while(headN1!=null && headN2!=null){
               if(headN1.data<headN2.data){
                   curr.next=headN1;
                   headN1=headN1.next;
               }else{
                   curr.next=headN2;
                   headN2=headN2.next;
               }
               curr=curr.next;
           }
           if(headN1!=null){
               curr.next=headN1;
           }else if(headN2!=null){
               curr.next=headN2;
           }
           head = newNode.next;
    }

       public void printNode(){
           Node curr=head;
           while (curr!=null){
               System.out.println(curr.data);
               curr=curr.next;
           }
       }
}
