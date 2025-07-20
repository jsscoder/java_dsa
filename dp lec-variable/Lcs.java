import java.util.*;

public class Lcs {

    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(LCS(text1, text2, 0, 0));
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
    }

    public static int LCSBU(String text1, String text2) {
        int ans = 0;
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static int LCS(String text1, String text2, int i, int j) {
        int ans = 0;
         if (i == text1.length() || j == text2.length()) return 0;

        if (text1.charAt(i) == text2.charAt(j)) {
            ans = 1 + LCS(text1, text2, i + 1, j + 1);

        } else {
            int f = LCS(text1, text2, i + 1, j);
            int s = LCS(text1, text2, i, j + 1);
            ans = Math.max(f, s);

        }
        return ans;

        // return dp[i][j] = ans;
    }

}