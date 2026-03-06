class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        for(int num : nums){
            System.out.print(num);
        }
    }
}