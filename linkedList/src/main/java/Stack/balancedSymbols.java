package Stack;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

public class balancedSymbols {
    public boolean isValidSymbolPattern(String inputStr){
        Stack<Character> stk = new Stack<Character>();
        if (StringUtils.isBlank(inputStr)){
            return true;
        }
        for (int i=0; i<inputStr.length();i++){
            if('(' == inputStr.charAt(i) || '{' == inputStr.charAt(i) || '[' == inputStr.charAt(i)){
                stk.push(inputStr.charAt(i));
            }else if(')'==inputStr.charAt(i)){
                if(!stk.isEmpty() && stk.peek() == '('){
                    stk.pop();
                }else{
                    return false;
                }
            }else if('}'==inputStr.charAt(i)){
                if(!stk.isEmpty() && stk.peek()=='{'){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(']'==inputStr.charAt(i)){
                if(!stk.isEmpty() && stk.peek()=='['){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }

        if (!stk.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String [] args){
        balancedSymbols bs = new balancedSymbols();
        System.out.println("for (A+B)+(C+D) "+bs.isValidSymbolPattern("(A+B)+(C+D)"));
        System.out.println("for (A+B)+(C+D "+bs.isValidSymbolPattern("(A+B)+(C+D"));
        System.out.println("for ((A+B)+(C+D) "+bs.isValidSymbolPattern("((A+B)+(C+D)"));
        System.out.println("for ([A+B])+({C+D}) "+bs.isValidSymbolPattern("([A+B])+({C+D})"));
        System.out.println("for ([A+B])+({C+D})} "+bs.isValidSymbolPattern("([A+B])+({C+D})}"));
    }
}
