package dsa.studentpack;

public class TargetSum {
    public static int ways(int total, int k) {
        if (total == 0) {
            return 0;
        }
        long[][] csum = new long[k + 1][total + 1];
        for (int i = 1; i < k + 1; i++) {
            csum[i][0] = 0;
        }
        for (int i = 1; i < total + 1; i++) {
            csum[0][i] = 0;
            csum[1][i] = 1;
        }
        for (int i = 2; i < k + 1; i++) {
            for (int j = 1; j < total + 1; j++) {
                if (j < i) {
                    csum[i][j] = csum[i - 1][j];
                } else if (i == j) {
                    csum[i][j] = (csum[i - 1][j] + 1 ) % 10000007;
                } else {
                    csum[i][j] = csum[i - 1][j] + csum[i][j];
                }
            }
        }
        return (int) (csum[k][total] % 100000007);
    }
}
