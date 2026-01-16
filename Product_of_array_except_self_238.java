package Leetcode;

public class Product_of_array_except_self_238 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int[] ans = new int[n];
        int pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            pro *= nums[i];
            right[i] = pro;
        }
        int left = 1;
        for (int i = 0; i < n - 1; i++) {
            ans[i] = left * right[i + 1];
            left *= nums[i];
        }
        ans[n - 1] = left;
        return ans;
    }
}
