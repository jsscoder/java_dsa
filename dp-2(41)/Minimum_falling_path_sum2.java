//package dp-2(41);

public class Minimum_falling_path_sum2 {
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
        for(int i=0; i
        <n; i++){
            ans=Math.min(ans,Minimum_falling_path_sum(matrix,0,i,dp));
        }
        System.out.println(ans);
    }

    public static int Minimum_falling_path_sum(int[][] matrix, int cr, int cc, int[][] dp) {
if(cc<0 || cc>=matrix.length){
return Integer.MAX_VALUE;
}
        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            if (col == cc) {
                continue;
            }
            ans = Math.min(ans, Minimum_falling_path_sum(matrix, cr + 1, col, dp));
        }
        return dp[cr][cc] = ans + matrix[cr][cc];
    }
}
