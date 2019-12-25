package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfNodesInTree {

    private int countWithRecursion(BinaryTreeNode btn) {
        int leftCount = btn.leftPointer == null ? 0 : countWithRecursion(btn.leftPointer);
        int rightCount = btn.rightPointer == null ? 0 : countWithRecursion(btn.rightPointer);
        return 1 + leftCount + rightCount;
    }

    private int countWithoutRecursion(BinaryTreeNode btn){
        int cnt = 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        while (!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            cnt += 1;
            if(tmp.leftPointer != null) q.offer(tmp.leftPointer);
            if(tmp.rightPointer != null) q.offer(tmp.rightPointer);
        }
        return cnt;
    }

    public static void main(String []args){
        numberOfNodesInTree nodecount = new numberOfNodesInTree();
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
        System.out.println(nodecount.countWithRecursion(btn));
        System.out.println(nodecount.countWithoutRecursion(btn));
    }
}
