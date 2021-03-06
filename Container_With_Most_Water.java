class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            maxArea = Math.max((right - left) * Math.min(height[left], height[right]), maxArea);
            if (height[left] < height[right])
                left++;
            else if (height[left] > height[right])
                right--;
            else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
