package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductPairInArray {
    private void productPairExists(int[] arr, int num){
        Set<Integer> s = new HashSet<>();
        Arrays.stream(arr).forEach(elem -> {
            if(elem == 0 && num ==0) {System.out.println("***********product exists"); return;}
            int d = Math.abs(num/elem);
            if (s.contains(d)) {
                System.out.println("**********product exists");
                return;
            }else{
                s.add(Math.abs(elem));
            }
        });
    }

    public static void main(String[] args) {
        ProductPairInArray p =new ProductPairInArray();
        int arr[] = {0, 20, 9, 40};
        p.productPairExists(arr,0);
    }
}
