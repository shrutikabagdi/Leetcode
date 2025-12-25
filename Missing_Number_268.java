package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number_268 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Missing_Number_268 obj = new Missing_Number_268();
        int result = obj.missingNumber(nums);

        System.out.println("Missing number is: " + result);

        sc.close();
    }
}












