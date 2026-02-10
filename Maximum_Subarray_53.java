package Leetcode;

public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] + currSum > nums[i]) currSum = nums[i]+currSum;
            else currSum = nums[i];
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
