package Arrays.Multi-Dimensional Arrays;

public class Solution {
    public boolean magicSquare(int[][] mat) {
        int n = mat.length;
        boolean[] seen = new boolean[n * n + 1];

        int target = 0;
        for (int j = 0; j < n; j++) {
            target += mat[0][j];
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;

            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                if (val < 1 || val > n * n || seen[val]) {
                    return false;
                }
                seen[val] = true;

                rowSum += mat[i][j];
                colSum += mat[j][i];
            }

            if (rowSum != target || colSum != target) {
                return false;
            }
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += mat[i][i];
            diag2 += mat[i][n - 1 - i];
        }

        return diag1 == target && diag2 == target;
    }
} {
  
}
