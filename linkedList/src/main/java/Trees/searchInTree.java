package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class searchInTree {

    public Boolean searchElemUsingRecursion(BinaryTreeNode btn, int data){
        if (btn == null) return false;
        if (btn.data == data) return true;
        return searchElemUsingRecursion(btn.leftPointer, data) || searchElemUsingRecursion(btn.rightPointer, data);
    }

    public Boolean searchElemWithoutRecursion(BinaryTreeNode btn, int data){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        while(!q.isEmpty()){
            BinaryTreeNode tmp =q.poll();
            if(tmp.data == data) return true;
            if(tmp!= null){
                if(tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if(tmp.rightPointer != null) q.offer(tmp.rightPointer);
            }
        }
        return false;
    }

    public static void main(String []args){
        searchInTree srch = new searchInTree();
        BinaryTreeNode btn = new BinaryTreeNode(1);
        BinaryTreeNode btn1 = new BinaryTreeNode(2);
        BinaryTreeNode btn2 = new BinaryTreeNode(3);
        BinaryTreeNode btn3 = new BinaryTreeNode(4);
        BinaryTreeNode btn4 = new BinaryTreeNode(5);
        BinaryTreeNode btn5 = new BinaryTreeNode(6);
        BinaryTreeNode btn6 = new BinaryTreeNode(7);
        btn1.leftPointer = btn3;
        btn1.rightPointer = btn4;
        btn2.leftPointer = btn5;
        btn2.rightPointer = btn6;
        btn.leftPointer = btn1;
        btn.rightPointer = btn2;
        System.out.println(srch.searchElemUsingRecursion(btn,9));
        System.out.println(srch.searchElemWithoutRecursion(btn,9));
    }
}
