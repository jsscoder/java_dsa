import java.util.*;

public class AGGRCOW_spoj {
    public static void main(String[] args) {
        int[] stall = { 1, 2, 8, 4, 9 };
        int noc = 3;
        Arrays.sort(stall);
        System.out.println(largest_min(stall, noc));
    }

    public static int largest_min(int stalls[], int noc) {
        int high = stalls[stalls.length - 1] - stalls[0];
        int low = 0;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high / 2);
            if (isPossible(stalls, noc, mid) == true) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }

    public static boolean isPossible(int[] stalls, int noc, int mid) {
        int pos = stalls[0];
        int cow = 1;
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - pos >= mid) {
                cow++;
                pos = stalls[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
