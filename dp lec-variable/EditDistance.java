import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {

        String s = "FOOD";
        String t = "MONEY";
            int dp[][]=new int[s.length()][t.length()];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
        
    }

    public static int Min_ops(String s, String t, int i, int j, int[][] dp) {
        if(i==s.length()){
            return t.length()-j;
        }
        if (j==t.length()){
            return s.length()-i;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == t.charAt(j)) {
            ans = Min_ops(s, t, i + 1, j + 1, dp);
        } else {
            int D = Min_ops(s, t, i + 1, j, dp);
            int R = Min_ops(s, t, i + 1, j + 1, dp);
            int I = Min_ops(s, t, i, j + 1, dp);
            ans = 1 + Math.min(R, Math.min(D, I));

        }
        return  dp[i][j]=ans;
    }
}
