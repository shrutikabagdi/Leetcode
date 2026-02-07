package Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_I_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int m = nums1.length, n = nums2.length;
        Stack<Integer> stack = new Stack();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(),num);
            }
            stack.add(num);
        }
        int i = 0;
        for(int num : nums1) {
            result[i++] = map.getOrDefault(num, -1);
        }
        return result;
    }
}
