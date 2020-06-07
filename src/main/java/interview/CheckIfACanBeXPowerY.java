package interview;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class CheckIfACanBeXPowerY {
    private void checkNumber(int num){
        for (int i=2;i<=ceil(Math.sqrt(num));i++){
            double d = Math.pow(num,(1.0/i));
            if(floor(d)==d) {
                System.out.println("yes can be expressed");
                return;
            }
        }
        System.out.println("can't be expressed");
    }

    public static void main(String[] args) {
        CheckIfACanBeXPowerY c =new CheckIfACanBeXPowerY();
        c.checkNumber(10);
    }
}
