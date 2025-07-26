//package dp-2(41);

public class Leetcode_931 {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

        int n = matrix.length;
        int[][] dp = new int[n][n];

        // Initialize dp with a sentinel value (-1 means not calculated)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, Minimum_Falling_Path(matrix, 0, i, dp));
        }
        System.out.println(ans);
    }

    public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc, int[][] dp) {
        if (cc < 0 || cc >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        if (dp[cr][cc] != 10000) {
            return dp[cr][cc];
        }
        int ld = Minimum_Falling_Path(matrix, cr + 1, cc - 1, dp);
        int rd = Minimum_Falling_Path(matrix, cr + 1, cc + 1, dp);
        int d = Minimum_Falling_Path(matrix, cr + 1, cc, dp);
        int ans = Math.min(ld, Math.min(d,rd)) + matrix[cr][cc];
        //return dp[cr][cc] = ans;
        dp[cr][cc]=ans;
        return dp[cr][cc];
    }

}
