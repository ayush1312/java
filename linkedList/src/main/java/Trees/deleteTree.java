package Trees;

import java.util.Stack;

public class deleteTree {

    public void  deltreepostorder(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        stk.push(btn);
        BinaryTreeNode prev = null;
        while(! stk.isEmpty()){
            BinaryTreeNode curr = stk.peek();
            if(prev == null || prev.leftPointer == curr || prev.rightPointer == curr){
                if (curr.leftPointer != null) stk.push(curr.leftPointer);
                else if(curr.rightPointer != null) stk.push(curr.rightPointer);
                prev = curr;
            }else if(curr.leftPointer == prev){
                if (curr.rightPointer != null) stk.push(curr.rightPointer);
                prev = curr;
            }else{
                prev = null;
                prev = curr;
                stk.pop();
            }
        }
    }

    public static void main(String []args){
        deleteTree delTree = new deleteTree();
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
        delTree.deltreepostorder(btn);
        System.out.println(btn);
    }
}
