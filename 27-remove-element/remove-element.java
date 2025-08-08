class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        // ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            else{
                continue;
            }
        }
        // k = list.size();
        return k ; 
    }
}