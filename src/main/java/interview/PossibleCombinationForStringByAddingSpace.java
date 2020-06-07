package interview;

import java.util.ArrayList;
import java.util.List;

public class PossibleCombinationForStringByAddingSpace {
    private void formString(String str, List<String> result,String prefix){
        if(str.length()==0) return;
        for(int i=1;i<str.length();i++){
            String newPrefix = prefix + str.substring(0,i);
            result.add(newPrefix +" "+ str.substring(i));
            formString(str.substring(i),result,newPrefix);
        }
    }

    public static void main(String[] args) {
        PossibleCombinationForStringByAddingSpace p = new PossibleCombinationForStringByAddingSpace();
        List<String> l = new ArrayList<>();
        l.add("ABC");
        p.formString("ABCD",l,"");
        System.out.println(l.size());
    }
}
