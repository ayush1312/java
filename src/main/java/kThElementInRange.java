import java.util.ArrayList;

public class kThElementInRange {
    public void kthElem(int[] start,int[] end, int kthelement){
        int len=start.length;
        ArrayList newarr = new ArrayList();
        for(int i=0;i<len;i++){
            for (int j=start[i];j<=end[i];j++){
                newarr.add(j);
            }
        }
        System.out.println(newarr.get(kthelement-1));
    }

    public static void main(String args[]){
        kThElementInRange k = new kThElementInRange();
        int[] start = {1,8,21};
        int[] end = {4,10,23};
        k.kthElem(start,end,6);
    }
}
