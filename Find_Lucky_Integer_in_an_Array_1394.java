package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Find_Lucky_Integer_in_an_Array_1394 {
    static class Solution {
        public int findLucky(int[] arr) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int ele = arr[i];
                hm.put(ele, hm.getOrDefault(ele, 0) + 1);
            }
            int ans = -1;
            for (int key : hm.keySet()) {
                if (hm.get(key) == key) {
                    ans = Math.max(ans, key);
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.findLucky(arr);
        System.out.println("Lucky Integer: " + result);
    }
}
