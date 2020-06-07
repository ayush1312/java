package interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
    public void level(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        q.offer(btn);
        q.offer(null);
        int cnt =1;
        boolean flip = true;
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if (tmp != null ) {
                if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
                if(flip){
                    System.out.println(tmp.data);
                }else{
                    stk.push(tmp.data);
                }
            }else {
                flip = !flip;
                if(!q.isEmpty()) q.offer(null);
                while(!stk.isEmpty()){
                    System.out.println(stk.pop());
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String args[]){
        LevelOrderTraversal l = new LevelOrderTraversal();
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
        l.level(btn);
    }
}
