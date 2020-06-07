package interview;

public class CheckIfAllBitsAreSet {
    private void checkBits(int num){
        if(num ==0) {
            System.out.println("no");
            return;
        }else{
            if((num & (num+1))== 0) System.out.println("yes");
            else System.out.println("no");
        }
    }

    public static void main(String[] args) {
        CheckIfAllBitsAreSet c =new CheckIfAllBitsAreSet();
        c.checkBits(14);
    }
}
