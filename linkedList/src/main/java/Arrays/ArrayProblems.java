package Arrays;

import java.util.HashMap;

public class ArrayProblems {

    public void removeDuplicate(int[] arr){
        HashMap<Integer,Integer> uniqueMap =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            Integer val = uniqueMap.get(arr[i]);
            if(val == null){
                System.out.println(arr[i]);
                uniqueMap.put(arr[i],arr[i]);
            }else{
                val = null;
            }
        }
        //uniqueMap.forEach((k,v)->System.out.println("List of array is :"+k));
    }

    public void occuranceInRange(int start,int end,String s,String[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i>=start &&i<=end && arr[i]==s){
                count++;
            }
            if(i>end) break;
        }
        System.out.println(count);
    }

    public Boolean matchArray(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i=0;i<arr1.length;i++){
            if(hmap.get(arr1[i])==null){
                hmap.put(arr1[i],1);
            }else{
                int count=0;
                count=hmap.get(arr1[i]);
                count++;
                hmap.put(arr1[i],count);
            }
        }

        for(int i=0;i<arr1.length;i++){
            if (!hmap.containsKey(arr2[i]))
                return false;
            if (hmap.get(arr2[i]) == 0)
                return false;

            int count = hmap.get(arr2[i]);
            --count;
            hmap.put(arr2[i], count);
        }
        return true;
    }

    public static void main(String args[]){
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] arr ={ 1, 2, 5, 1, 7, 2, 4, 2};
        //arrayProblems.removeDuplicate(arr);
        String[] arrString = {"abc", "def", "abc"};
        arrayProblems.occuranceInRange(1,2,"abc",arrString);
    }
}
