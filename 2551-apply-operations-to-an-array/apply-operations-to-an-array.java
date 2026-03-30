class Solution {
    public int[] applyOperations(int[] nums) {

        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] *= 2;
                nums[i] = 0;
            }
            else{
                continue;
            }
        }

        int left = 0 ;
        int right = 0;

        while(right < n){
            if(nums[right] == 0){
                right++;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right++;
            }
        }
        return nums;
    }
}