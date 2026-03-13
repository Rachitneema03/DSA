class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
          int max=0;
        int curr_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                curr_count++;
            }
            if(curr_count>max)
            {
                max=curr_count;
                
            }   
            if(nums[i]!=1){
                
                curr_count=0;}
        }     
        return max;
    }
}