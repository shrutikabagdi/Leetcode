package Leetcode;
public class SingleNumber_136 {

    public int singleNumber_136(int[] nums) {
        int single = 0;
        for(int i : nums) {
            single ^= i;
        }
        return single;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        SingleNumber_136 obj = new SingleNumber_136();

        System.out.println(obj.singleNumber_136(nums));
    }
}
