package Trees;

import java.util.Stack;

public class mirrorTree {

    public void treeMirror(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        BinaryTreeNode tmpNode = null;
        stk.push(btn);
        while(!stk.isEmpty()){
            BinaryTreeNode tmp = stk.pop();
            if(tmp != null){
                tmpNode = tmp.rightPointer;
                tmp.rightPointer=tmp.leftPointer;
                tmp.leftPointer=tmpNode;
            }
            System.out.println(tmp.data);
            if (tmp.rightPointer!=null) {
                stk.push(tmp.rightPointer);
            }
            if (tmp.leftPointer!=null) {
                stk.push(tmp.leftPointer);
            }
        }
    }

    public Boolean checkMirror(BinaryTreeNode b1, BinaryTreeNode b2){
        if(b1 ==null && b2 == null) return true;
        if (b1 == null || b2 == null) return false;
        if(b1.data != b2.data) return false;
        else return(checkMirror(b1.leftPointer,b2.rightPointer) && checkMirror(b1.rightPointer,b2.leftPointer));
    }

    public static void main(String []args){
        mirrorTree mt = new mirrorTree();
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

        BinaryTreeNode cpbtn = new BinaryTreeNode(1);
        BinaryTreeNode cpbtn1 = new BinaryTreeNode(3);
        BinaryTreeNode cpbtn2 = new BinaryTreeNode(2);
        BinaryTreeNode cpbtn3 = new BinaryTreeNode(7);
        BinaryTreeNode cpbtn4 = new BinaryTreeNode(6);
        BinaryTreeNode cpbtn5 = new BinaryTreeNode(5);
        BinaryTreeNode cpbtn6 = new BinaryTreeNode(4);
        cpbtn1.leftPointer = cpbtn3;
        cpbtn1.rightPointer = cpbtn4;
        cpbtn2.leftPointer = cpbtn5;
        cpbtn2.rightPointer = cpbtn6;
        cpbtn.leftPointer = cpbtn1;
        cpbtn.rightPointer = cpbtn2;
        //mt.treeMirror(btn);
        System.out.println(mt.checkMirror(btn,cpbtn));
    }
}
