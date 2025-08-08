class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closetsum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length -2 ; i++){
            int left = i+1;
            int right = nums.length -1 ;

            while(left < right){
                int currsum = nums[i] + nums[left] + nums[right];

                if(Math.abs(currsum - target) < Math.abs(closetsum - target)){
                    closetsum = currsum;
                }
                else if (currsum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closetsum;
    }
}