class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;

        int left_max = 0;
        int right_max = 0;
        int count = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(left_max > height[left]){
                    count += (left_max - height[left]); 
                    left++;
                }
                else{
                    left_max = height[left];
                    left++;
                }
            }
            else {
                if (right_max > height[right]) {
                    count += (right_max - height[right]);
                } else {
                    right_max = height[right];
                }
                right--;
            }
        }
        return count;
    }
}