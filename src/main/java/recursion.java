public class recursion {
    public int Print(int n){
        if (n == 0) return 0;
        else {
            System.out.println(n);
            return Print(n-1);
        }
    }
}
