package Leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate_217 {

    public static boolean containsDuplicate_217(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : nums) {
            if (!set.add(value)) {  
                return true;
            }
        }
        return false;
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

        if (containsDuplicate_217(nums)) {
            System.out.println("Duplicate exists");
        } else {
            System.out.println("No duplicate found");
        }

        sc.close();
    }
}
