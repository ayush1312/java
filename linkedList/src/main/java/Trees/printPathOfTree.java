package Trees;

import java.util.Stack;

public class printPathOfTree {

    public void allPath(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        Stack<BinaryTreeNode> printstk = new Stack<>();
        stk.push(btn);
        while(!stk.isEmpty()){
            BinaryTreeNode tmp = stk.pop();
            printstk.push(tmp);
            if(tmp.rightPointer == null && tmp.leftPointer == null){
               Stack<BinaryTreeNode> copyprintstk = (Stack) printstk.clone();
               while(!copyprintstk.isEmpty()){
                   System.out.println(copyprintstk.pop().data);
               }
               System.out.println("********");
                if(!stk.isEmpty()) {
                    while (printstk.peek().rightPointer != stk.peek()) {
                        printstk.pop();
                    }
                }
            }
            if (tmp.rightPointer!=null) {
                stk.push(tmp.rightPointer);
            }
            if (tmp.leftPointer!=null) {
                stk.push(tmp.leftPointer);
            }
        }
    }
    public static void main(String []args){
        printPathOfTree pp = new printPathOfTree();
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
        pp.allPath(btn);
    }
}
