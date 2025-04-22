import java.util.Arrays;

class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        // Expected Output: [1, 3, 2]
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int p = -1;

        // Step 1: Find the pivot (first decreasing element from the right)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        // Step 2: If no pivot is found, reverse the array (last permutation case)
        if (p == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the successor (smallest element greater than nums[p] to its right)
        int q = -1;
        for (int i = n - 1; i > p; i--) {
            if (nums[i] > nums[p]) {
                q = i;
                break;
            }
        }

        // Step 4: Swap nums[p] and nums[q]
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;

        // Step 5: Reverse the suffix
        reverse(nums, p + 1, n - 1);
    }

    //  reverse subarray
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
