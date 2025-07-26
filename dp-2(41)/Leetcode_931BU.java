package dp-2(41);

public class Leetcode_931BU {
    public static void main(String[] args) {
        


        int[][] matrix = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        int n = matrix.length;

        // Create a DP matrix initialized as a copy of the last row
        int[][] dp = new int[n][n];
        
        // Copy last row from matrix to dp
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = matrix[n - 1][i];
        }

        // Fill the DP table from bottom to top
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < n; col++) {
                int down = dp[row + 1][col];
                int leftDiag = col > 0 ? dp[row + 1][col - 1] : Integer.MAX_VALUE;
                int rightDiag = col < n - 1 ? dp[row + 1][col + 1] : Integer.MAX_VALUE;

                dp[row][col] = matrix[row][col] + Math.min(down, Math.min(leftDiag, rightDiag));
            }
        }

        // Find the minimum in the first row
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[0][i]);
        }

        System.out.println(ans);
    }


}

