class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        if (n == 1) {
            for (int j = 0; j < m; j++) {
                ans.add(mat[0][j]);
            }
            return ans;
        }

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                ans.add(mat[i][0]);
            }
            return ans;
        }

        // Top row
        for (int j = 0; j < m; j++) {
            ans.add(mat[0][j]);
        }

        // Right column
        for (int i = 1; i < n; i++) {
            ans.add(mat[i][m - 1]);
        }

        // Bottom row
        for (int j = m - 2; j >= 0; j--) {
            ans.add(mat[n - 1][j]);
        }

        // Left column
        for (int i = n - 2; i >= 1; i--) {
            ans.add(mat[i][0]);
        }

        return ans;
    }
}