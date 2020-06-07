package interview;

public class RightMostSetBit {
    public static void main(String[] args) {
        int num = 19;
        int pos = 1;
        // counting the position of first set bit
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if ((num & (1 << i)) == 0)
                pos++;

            else
                break;
        }
        System.out.println(pos);
    }
}