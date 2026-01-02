class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = 2 * (nums.length);
        int ans[] = new int[size];
    for(int i = 0 ; i < size  ; i++){
        if(i < nums.length){
            ans[i] = nums[i];
        }
        else{
            ans[i] = nums[i - nums.length];
        }
    }
    return ans;
    }
}