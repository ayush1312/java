import java.util.Stack;

public class reduceString {
    public void reduceStringVal(String str){
        int i=0;
        Stack<Character> stk = new Stack<>();
        while(i<str.length()){
            char j = str.charAt(i);
            if(stk.isEmpty()) {
                stk.push(j);
            } else{
                if (stk.peek()!=j && (Character.toUpperCase(j)== Character.toUpperCase(stk.peek()))){
                    stk.pop();
                }else{
                    stk.push(j);
                }
            }
            i++;
        }
        System.out.println(stk.size());
    }

    public static void main (String []args){
        String str = "AsSaDda";
        reduceString r = new reduceString();
        r.reduceStringVal(str);
    }
}
