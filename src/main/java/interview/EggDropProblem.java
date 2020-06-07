package interview;

import static java.lang.Math.max;

public class EggDropProblem {
    public void minNoOfTrial(int numEggs, int numFloors) {
        int count[][] = new int[numEggs+1][numFloors+1];
        for (int i = 1; i <= numFloors; i++) count[1][i] = i;
        for (int i = 1; i <= numEggs; i++) count[i][1] = 1;
        for (int i = 2; i <= numEggs; i++) {
            for (int j = 2; j <= numFloors; j++) {
                count[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    int res = 1 + max(count[i - 1][k - 1], count[i][j - k]);
                    if (res < count[i][j])  count[i][j] = res;
                }
            }
        }
        System.out.println("minimum attempts = " + count[numEggs][numFloors]);
    }

    public static void main(String[] args) {
        EggDropProblem e = new EggDropProblem();
        e.minNoOfTrial(4, 10);
    }
}
