package interview;

import java.util.Stack;

public class MinimumString {
    int i = 0;
    public void minString(String str){
        Stack<Character> stk = new Stack<>();
        while(i < str.length()){
            if (stk.isEmpty()){
                stk.push(str.charAt(i));
            }else {
                Character c = stk.peek();
                if(Character.toUpperCase(c)==Character.toUpperCase(str.charAt(i))){
                    stk.pop();
                }else{
                    stk.push(str.charAt(i));
                }
            }
            i++;
        }
        if(stk.isEmpty()) System.out.println("null");
        else {
            String str1="";
            while(!stk.isEmpty()){
                str1=stk.pop()+str1;
            }
            System.out.println(str1);
        }
    }

    public static void main (String []args){
        MinimumString m = new MinimumString();
        m.minString("ASbBsd");
    }
}
