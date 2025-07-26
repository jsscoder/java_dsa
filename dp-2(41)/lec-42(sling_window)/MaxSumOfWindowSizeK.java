public class MaxSumOfWindowSizeK {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 4, 5, 7, 2, 3 };
        int k = 3;
        System.out.println(Maximum_Sum(arr, k));

    }

    public static int Maximum_Sum(int arr[], int k) {
        int ans = 0;
        int sum = 0;

        // list window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;

        for (int i = k; i < arr.length; i++) {
            // grow
            sum += arr[i];
            // shrink
            sum -= arr[i - k];

            // ans
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}