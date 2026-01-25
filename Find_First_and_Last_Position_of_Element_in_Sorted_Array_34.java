package Leetcode;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {

    class Solution {

        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, -1};

            if (nums == null || nums.length == 0) {
                return ans;
            }

            ans[0] = firstOccurrence(nums, target);
            ans[1] = lastOccurrence(nums, target);

            return ans;
        }

        private int firstOccurrence(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            int ans = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    ans = mid;
                    end = mid - 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }

        private int lastOccurrence(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            int ans = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    ans = mid;
                    start = mid + 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 obj =
                new Find_First_and_Last_Position_of_Element_in_Sorted_Array_34();

        Solution sol = obj.new Solution();

        int[] nums = {5, 7, 7, 8, 8, 10}; // input array
        int target = 8;                 // target element

        int[] result = sol.searchRange(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
