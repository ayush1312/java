package interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
    public void removeDuplicate(Integer []arr){
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(Arrays.asList(arr));
        s.forEach(System.out::println);
    }

    public static void main(String[] args) {
        RemoveDuplicateFromArray m = new RemoveDuplicateFromArray();
        Integer[] arr = {2,3,4,2,2,4,3,2,1,2,1};
        m.removeDuplicate(arr);
    }
}
