import java.util.*;

public class maximum_calc {
    public static void main(String[] args) {

        // leetcode 1537 get maximum score
        int nums1[] = { 2, 4, 5, 8, 10 };
        int nums2[] = { 4, 6, 8, 9 };
    }

    public static int maxSum(int[] nums1, int[] nums2) {
        int mod = (int) Math.pow(10, 9) + 7;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int s1 = 0;
        int s2 = 0;
        int ans = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                long sum1 = sumArray(nums1, s1, i);
                long sum2 = sumArray(nums1, s2, j);
                ans = Math.max(sum1, sum2);
                s1 = i + 1;
                s2 = j + 1;
                i++;
                j++;
            }
        }
        long sum1 = sumArray(nums1, s1, n1);
        long sum2 = sumArray(nums1, s2, n2);
        ans =  ans + Math.max(sum1, sum2)%mod;
        return ans;
    }

    public static int sumArray(int arr[], int i, int j) {
        int sum = 0;
        for (int k = 1; k <= j; k++) {
            sum += arr[k];
        }
        return (int)sum;
    }
}
