package interview;

public class NumOfNonIncreasingArray {
    public void numArrays(int[] arr){
        int count=0;
        for(int i=0; i<arr.length;i++){
            count++;
            for(int j=i+1;j<arr.length;j++) {
                //System.out.println(arr[j]);
                if (arr[j-1]<arr[j]) break;
                    count++;
                /*for(int k=i;k<=j;k++) {
                    System.out.print(arr[k]);
                }*/
                //System.out.println();
            }
            //.out.println();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        NumOfNonIncreasingArray n = new NumOfNonIncreasingArray();
        n.numArrays(arr);
    }
}
