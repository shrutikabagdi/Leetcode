package Leetcode;

import java.util.Arrays;

public class Squares_of_a_sorted_Array_977 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while (start <= end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Squares_of_a_sorted_Array_977 obj = new Squares_of_a_sorted_Array_977();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = obj.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
