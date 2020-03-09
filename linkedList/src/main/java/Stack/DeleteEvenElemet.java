package Stack;

import java.util.Stack;

public class DeleteEvenElemet {

    static void deleteEven(Stack<Integer> stk){
        int count=0;
        while(!stk.isEmpty()){
            count++;
            if(count%2==0){
                stk.pop();
            }else {
                System.out.println(stk.peek());
                stk.pop();
            }
        }
    }

    public static void main(String [] args){
        Stack<Integer> s = new Stack<>();
        s.push(16);
        s.push(15);
        s.push(29);
        s.push(24);
        s.push(19);
        deleteEven(s);
    }
}
