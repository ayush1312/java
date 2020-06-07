package interview;

public class DecodeSequence {

    public void decodeCount(int[] num){
        int[] count = new int[num.length+1];
        count[0]=1;
        count[1]=1;
        for(int i=2;i<=num.length;i++){
            if(num[i-1]>0) count[i]=count[i-1];
            if ((num[i-2] == 1 || num[i-2]==2) && num[i-1] < 7) count[i] += count[i-2];
        }
        System.out.println("***************"+count[num.length]+"************");
    }

    public static void main(String[] args) {
        DecodeSequence d = new DecodeSequence();
        int num[] ={1,2,3};
        d.decodeCount(num);
    }
}
