public class product_of_sum {
    public static void main(String[] args) {
        // int [] nums={1,2,3,4};
        // int ans []=productExceptSelf(nums);
        // for(int i=0; i<ans.length; i++){
        //    return productExceptSelf(nums);
        // }

        return productExceptSelf(nums)
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i] * left[i - 1];
        }

        int[] right = new int[n];
        right[0] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }

}
// 915,11(LEETCODE), CATCH THE COIN(CODE FORCES ) #PRACTICE HW
