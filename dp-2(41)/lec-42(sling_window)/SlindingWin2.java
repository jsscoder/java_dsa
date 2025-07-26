import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class SlindingWin2 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int[] res = Window_Maximum(nums, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] Window_Maximum(int[] arr, int k) {  // ✅ Fix return type
        Deque<Integer> q = new LinkedList<>();
        int[] ans = new int[arr.length - k + 1];

        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }
            q.add(i);
        }

        int j = 0;
        ans[j++] = arr[q.getFirst()];

        for (int i = k; i < arr.length; i++) { 
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }

            q.add(i);

            if (q.getFirst() == i - k) {
                q.removeFirst();
            }

            ans[j++] = arr[q.getFirst()];
        }

        return ans;  // ✅ Fixed return type
    }
}
