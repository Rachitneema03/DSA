class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int c = nums[0];
        int vote = 0;
        for(int i = 0 ; i<n ; i++){
            if(c == nums[i]){
                vote++;
            }
            else{
                vote--;
                if(vote < 0){
                    c = nums[i];
                    vote++;
                }
            }
        }
        return c;
    }
}