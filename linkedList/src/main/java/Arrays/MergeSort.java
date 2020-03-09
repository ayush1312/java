package Arrays;

public class MergeSort {

    public void sort(int[] arr,int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public void merge(int[] arr,int l,int mid,int r){

        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int i = 0; i <n1; i++){
            lArr[i]=arr[l+i];
        }
        for(int j = 0; j < n2; j++){
            rArr[j]=arr[j+mid+1];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
     void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        MergeSort ms = new MergeSort();
        int[] arr={3,4,5,71,1,2};
        ms.sort(arr,0,arr.length-1);
        System.out.println("check in debug mode for array ;)");
        ms.printArray(arr);
    }
}
