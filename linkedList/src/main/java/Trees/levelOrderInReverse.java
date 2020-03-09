package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelOrderInReverse {

    public void reverseLevelTree(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<BinaryTreeNode> stk = new Stack<>();
        q.offer(btn);
        while (!q.isEmpty()){
            BinaryTreeNode tmp =q.poll();
            if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
            if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
            stk.push(tmp);
        }
        while (!stk.isEmpty()){
            System.out.println(stk.pop().data);
        }
    }

    public void depthOfTree(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        stk.push(btn);
        BinaryTreeNode prev = null;
        int maxDepth =0;
        while(!stk.isEmpty()){
            BinaryTreeNode curr = stk.peek();
            if (prev == null || prev.rightPointer == curr || prev.leftPointer == curr) {
                if(curr.leftPointer != null)  stk.push(curr.leftPointer);
                else if (curr.rightPointer != null) stk.push(curr.rightPointer);
            }else if(curr.leftPointer == prev) {
                if (curr.rightPointer != null) stk.push(curr.rightPointer);
            }else{
                stk.pop();
            }
            prev = curr;
            if (stk.size()>maxDepth) maxDepth = stk.size();
        }
        System.out.println(maxDepth);
    }

    public void depthOfTree2(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        q.offer(null);
        int cnt = 1;
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp !=null) {
                if (tmp.leftPointer == null && tmp.rightPointer == null)
                    break;
                if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
            }else{
                if(!q.isEmpty()) {
                    cnt++;
                    q.offer(null);
                }
            }
        }
        System.out.println(cnt);
    }

    public void noOfLeafNode(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        int cnt = 0;
        q.offer(btn);
        while (!q.isEmpty()){
            BinaryTreeNode tmp =q.poll();
            if(tmp.rightPointer == null && tmp.leftPointer == null) cnt++;
            if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
            if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
        }
        System.out.println(cnt);
    }

    public void noOfFullNode(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        int cnt = 0;
        q.offer(btn);
        while (!q.isEmpty()){
            BinaryTreeNode tmp =q.poll();
            if(tmp.rightPointer != null && tmp.leftPointer != null) cnt++;
            if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
            if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
        }
        System.out.println(cnt);
    }

    public void maxSumAtLevel(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        int sumAtLevel = 0;
        int maxSum = 0;
        q.offer(btn);
        q.offer(null);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if (tmp != null){
                if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
                sumAtLevel += tmp.data;
            }else {
                if(maxSum<sumAtLevel) maxSum = sumAtLevel;
                sumAtLevel = 0;
                if(!q.isEmpty()) q.offer(null);
            }
        }
        System.out.println(maxSum);
    }

    public void sumAtLevel(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        q.offer(null);
        int sum=0;
        int lvl = 1;
        while(!q.isEmpty()){
            BinaryTreeNode tmp =q.poll();
            if (tmp!=null){
                if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if(tmp.rightPointer != null) q.offer(tmp.rightPointer);
                sum += tmp.data;
            }else{
                System.out.println("at level "+lvl+" sum is "+sum);
                if(!q.isEmpty()){
                    lvl++;
                    sum=0;
                    q.offer(null);
                }
            }
        }
    }

    public void printLeafElement(BinaryTreeNode btn){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.rightPointer==null && tmp.leftPointer ==null)
                System.out.println(tmp.data);
            if(tmp.rightPointer!=null) q.offer(tmp.rightPointer);
            if(tmp.leftPointer !=null) q.offer(tmp.leftPointer);
        }
    }

    public static void main(String []args){
        levelOrderInReverse lr = new levelOrderInReverse();
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
        //lr.reverseLevelTree(btn);
        //lr.depthOfTree(btn);
        //lr.depthOfTree2(btn);
        //lr.noOfLeafNode(btn);
        //lr.noOfFullNode(btn);
        //lr.maxSumAtLevel(btn);
        //lr.sumAtLevel(btn);
        lr.printLeafElement(btn);
    }
}
