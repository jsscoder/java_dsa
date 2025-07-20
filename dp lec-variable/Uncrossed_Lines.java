public class Uncrossed_Lines {
    public static void main(String[] args) {

    }

    public static int uncrossedBU(int[] text1, int[] text2) {
        int ans = 0;
        int[][] dp = new int[text1.length + 1][text2.length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[dp.length][dp.length];
    }
}
