package Stack;

import java.util.Stack;

public class sortStack {
    public void sortStack(Stack<Integer> stk){
        Stack<Integer> currStack = new Stack();
        while(!stk.isEmpty()){
            int tmp = stk.pop();
            if (!currStack.isEmpty() && currStack.peek()>tmp){
                stk.push(currStack.pop());
            }
            currStack.push(tmp);
        }
        while(!currStack.isEmpty()){
            System.out.println(currStack.pop());
        }
    }

    public static void main(String []args){
        sortStack ss =new sortStack();
        Stack<Integer> s1 = new Stack<>();
        s1.push(8);
        s1.push(2);
        s1.push(9);
        s1.push(1);
        ss.sortStack(s1);
    }
}
