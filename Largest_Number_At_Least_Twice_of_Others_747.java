package Leetcode;

import java.util.Scanner;

public class Largest_Number_At_Least_Twice_of_Others_747 {

    public static int dominantIndex(int[] nums) {

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int maxIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
                maxIdx = i;
            } else if (nums[i] > smax) {
                smax = nums[i];
            }
        }

        if (max >= 2 * smax) {
            return maxIdx;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = dominantIndex(nums);

        System.out.println("Output: " + result);
    }
}
