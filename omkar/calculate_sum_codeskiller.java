import java.util.*;

public class calculate_sum_codeskiller {

    public static void main(String[] args) {
        // circular array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int q = sc.nextInt();
        while (q > 0) {
            int x = sc.nextInt();
            q--;
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = (int) (sum % 1000_000_007);
        System.out.println(ans);
    }

    public static int modify(int[] arr, int x) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i - x;
            if (j < 0) {
j+=arr.length;
            }
            a[i] = arr[i] + arr[j];
        }
        return a;

    }
}
