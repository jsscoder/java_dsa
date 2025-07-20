import java.util.Arrays;

public class CoinChanged {
    public static void main(String[] args) {
        int[] coin = { 1, 2, 5 };

        int amount = 5;
        int[][] dp = new int[coin.length][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);

        }
        System.out.println(CoinChange(coin, amount, 0, dp));
        System.out.println(CoinChangeBU(coin, amount));
    }


    public static int CoinChange(int[] coin, int amount, int i, int[][] dp) {

        if (amount == 0) {
            return 1;
        }

        if (i == coin.length || amount < 0)

        {
            return 0;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int inc = 0;
        int exc = 0;
        if (amount >= coin[i]) {
            inc = CoinChange(coin, amount - coin[i], i, dp);
        }

        exc = CoinChange(coin, amount, i + 1, dp);

        return dp[i][amount] = inc + exc;
    }
}
