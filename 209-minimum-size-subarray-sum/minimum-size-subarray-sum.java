class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minsubarr = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;

        for(int right = 0 ; right < n ; right++){
            sum += nums[right];

            while(sum >= target){
                minsubarr = Math.min(minsubarr , right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minsubarr == Integer.MAX_VALUE ? 0 : minsubarr;
    }
}