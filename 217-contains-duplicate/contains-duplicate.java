class Solution {
   
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> list = new HashSet<>();
        for(int i : nums){
            list.add(i);
        }

        if(list.size() == nums.length)
        return false;

        else
        return true;
    }
}