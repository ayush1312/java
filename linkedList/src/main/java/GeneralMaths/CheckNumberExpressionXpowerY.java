package GeneralMaths;

public class CheckNumberExpressionXpowerY {
    public static void checkNumber(int num){
        double y;
        double x=Math.sqrt(num);
        for(int i=2;i<=x;i++){
            y=Math.log10(num)/Math.log10(i);
            if(Math.floor(y)==y){
                System.out.println(i+" ^ "+ (int)y+" ="+num);
                break;
            }
        }
    }
    public static void main(String args[]){
        checkNumber(8);
        checkNumber(49);
        checkNumber(48);
    }
}
