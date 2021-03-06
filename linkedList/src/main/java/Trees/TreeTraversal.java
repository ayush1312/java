package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

    public void preOrder(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        stk.push(btn);
        while(!stk.isEmpty()){
            BinaryTreeNode tmp = stk.pop();
            System.out.println(tmp.data);
            if (tmp.rightPointer!=null) {
                stk.push(tmp.rightPointer);
            }
            if (tmp.leftPointer!=null) {
                stk.push(tmp.leftPointer);
            }
        }
    }

    public void inOrder(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        BinaryTreeNode currnode = btn;
        Boolean done =false;
        while(!done){
            if (currnode != null) {
                stk.push(currnode);
                currnode = currnode.leftPointer;
            }else{
                if (stk.isEmpty()){
                    done = true;
                }else {
                    currnode = stk.pop();
                    System.out.println(currnode.data);
                    currnode = currnode.rightPointer;
                }
            }
        }
    }

    public void postOrder(BinaryTreeNode btn){
        Stack<BinaryTreeNode> stk = new Stack<>();
        stk.push(btn);
        BinaryTreeNode prev = null;
        while(!stk.isEmpty()){
            BinaryTreeNode curr = stk.peek();
            if (prev == null || prev.rightPointer == curr || prev.leftPointer == curr) {
                if(curr.leftPointer != null)  stk.push(curr.leftPointer);
                else if (curr.rightPointer != null) stk.push(curr.rightPointer);
            }else if(curr.leftPointer == prev) {
                if (curr.rightPointer != null) stk.push(curr.rightPointer);
            }else{
                System.out.println(curr.data);
                stk.pop();
            }
            prev = curr;
        }
    }

    public void zigZag(BinaryTreeNode btn){
        Boolean leftToRight=false;
        ArrayList<Integer> curr = new ArrayList<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(btn);
        q.offer(null);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if (tmp != null){
                curr.add(tmp.data);
                if (tmp.leftPointer != null) q.offer(tmp.leftPointer);
                if (tmp.rightPointer != null) q.offer(tmp.rightPointer);
            }else{
                leftToRight = !leftToRight;
                if(!q.isEmpty()) q.offer(null);
                if(leftToRight){
                    for(int i = 0;i<curr.size();i++)
                        System.out.println(curr.get(i));
                }else{
                    Stack<Integer> stk = new Stack<>();
                    for(int i = 0;i<curr.size();i++)
                        stk.push(curr.get(i));
                    while(!stk.isEmpty())
                        System.out.println(stk.pop());
                }
                curr.clear();
            }
        }
    }

    public static void main(String []args){
        TreeTraversal pot = new TreeTraversal();
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
        //pot.preOrder(btn);
        //pot.inOrder(btn);
        //pot.postOrder(btn);
        pot.zigZag(btn);
    }
}
