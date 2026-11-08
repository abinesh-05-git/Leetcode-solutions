class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left <right){
            int width =right-left;
            int smallheight = Math.min(height[right],height[left]);
            int area = width * smallheight;
            max = Math.max(max,area);
            if(height[right]<height[left])  right--;
            else    left++;
        }
        return max;
    }
}
