import java.util.Arrays;

public class DistinctSubsequence {
    public static void main(String[] args) {
      
        String s = "rabbit";
        String t = "rabbit";
          int dp[][]=new int[s.length()][t.length()];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
    }

    public static int CoinChange(String s, String t, int i, int j, int[][] dp) {
        int inc = 0;
        int exc = 0;
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            inc = CoinChange(s, t, i + 1, j + 1, dp);
        }
        exc = CoinChange(s, t, i + 1, j, dp);
        return dp[i][j] = inc + exc;
    }
}
