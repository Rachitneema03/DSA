class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int ones = 0;
        for(int num : nums){
            if(num == 1){
                ones++;
            }
            max = Math.max(max , ones);
            if(num == 0){
                ones = 0;
            }
        }
        return max;
        
    }
}