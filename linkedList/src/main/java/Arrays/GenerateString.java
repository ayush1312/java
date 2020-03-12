package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateString {
    public  static void generateSeries(String str, List<String> result,String prefix){
        if (str.equals("")) return;
        for(int i=1;i<str.length();i++){
            String newPrefix= prefix+str.substring(0,i)+" ";
            result.add(newPrefix+str.substring(i));
            generateSeries(str.substring(i),result,newPrefix);
        }
    }
    public static void main(String[] args) {
        String str1 = "ABCDEFG";
        List<String> result = new ArrayList<>();
        result.add(str1);
        generateSeries(str1, result, "");
        System.out.println(result.size());
        result.forEach(elem -> System.out.println(elem));
    }
}
