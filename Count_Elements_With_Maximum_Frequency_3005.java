package Leetcode;

import java.util.HashMap;

public class Count_Elements_With_Maximum_Frequency_3005 {
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            int maxFreq = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int data : nums) {
                int freq = hm.getOrDefault(data, 0) + 1;
                hm.put(data, freq);
                maxFreq = Math.max(maxFreq, freq);
            }
            int result = 0;
            for (int key : hm.keySet()) {
                if (hm.get(key) == maxFreq) {
                    result += maxFreq;
                }
            }
            return result;
        }
    }
}