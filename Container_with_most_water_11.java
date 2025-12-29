package Leetcode;

public class Container_with_most_water_11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int maxCap = 0;
        while(start<end){
            int h = Math.min(height[start],height[end]);
            int width = end - start;

            int currCap = h * width;

            maxCap = Math.max(currCap, maxCap);

            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxCap;
    }
}
