package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class sumBinaryTree {
    public static  Boolean isSumTree(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q1 = new LinkedList();
        q1.offer(btn);
        int sum = 0;
        while(!q1.isEmpty()){
            sum = 0;
            BinaryTreeNode tmp =q1.poll();
            if(tmp.leftPointer!=null) {
                if(tmp.leftPointer.leftPointer!=null || tmp.leftPointer.rightPointer !=null){
                    sum+=2*tmp.leftPointer.data;
                }else{
                    sum+=tmp.leftPointer.data;
                }
                q1.offer(tmp.leftPointer);
            }
            if(tmp.rightPointer!=null) {
                if(tmp.rightPointer.leftPointer!=null || tmp.rightPointer.rightPointer!=null){
                    sum+=2*tmp.rightPointer.data;
                }else{
                    sum+=tmp.rightPointer.data;
                }
                q1.offer(tmp.rightPointer);
            }
            if((tmp.data != sum)&&(tmp.leftPointer!=null || tmp.rightPointer !=null)) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        BinaryTreeNode btn = new BinaryTreeNode(26);
        BinaryTreeNode btn1 = new BinaryTreeNode(10);
        BinaryTreeNode btn2 = new BinaryTreeNode(3);
        BinaryTreeNode btn3 = new BinaryTreeNode(4);
        BinaryTreeNode btn4 = new BinaryTreeNode(6);
        BinaryTreeNode btn5 = new BinaryTreeNode(3);
        btn1.leftPointer = btn3;
        btn1.rightPointer = btn4;
        btn2.leftPointer = btn5;
        btn.leftPointer = btn1;
        btn.rightPointer = btn2;

        if (isSumTree(btn))
            System.out.println("The given tree is a sum tree");
        else
            System.out.println("The given tree is not a sum tree");
    }
}
