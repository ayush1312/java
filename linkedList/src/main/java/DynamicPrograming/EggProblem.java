package DynamicPrograming;

public class EggProblem {
    public static void populateMatrix(int numEggs,int numFloor){
        int res;
        int combo[][]=new int[numEggs+1][numFloor+1];
        for (int i = 1;i <= numEggs;i++){
            combo[i][1]=1;
            //combo[i][0] = 0;
        }
        for(int i = 1;i<=numFloor;i++)
            combo[1][i]=i;

        for(int i=2;i<=numEggs;i++){
            for(int j=2;j<=numFloor;j++){
                combo[i][j] = Integer.MAX_VALUE;
                for(int k=1;k<=j;k++){
                     res = 1 + max(combo[i-1][k-1], combo[i][j-k]);
                    if (res < combo[i][j])
                        combo[i][j] = res;
                }
            }
        }
        System.out.println("min sol is "+combo[numEggs][numFloor]);
    }
    static int max(int a, int b) { return (a > b)? a: b; }
    public static void main(String args[])
    {
        int n = 2, k = 10;
        populateMatrix(n, k);
    }
}
