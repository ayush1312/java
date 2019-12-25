package Trees;

public class maxElementInBinaryTree {

    public int maxVal(BinaryTreeNode btn){
        int maxvalue =Integer.MIN_VALUE;
        if(btn != null){
            int leftMax = maxVal(btn.leftPointer);
            int rightMax = maxVal(btn.rightPointer);

            if(leftMax>rightMax)
                maxvalue = leftMax;
            else
                maxvalue = rightMax;

            if (btn.data>maxvalue)
                maxvalue = btn.data;
        }
        return maxvalue;
    }

    public static void main(String []args){
        maxElementInBinaryTree maxElem = new maxElementInBinaryTree();
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
        System.out.println(maxElem.maxVal(btn));
    }
}
