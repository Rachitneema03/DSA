class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int piv = nums1[i];
            int idx = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == piv) {
                    idx = j;
                    break;
                }
            }
            res[i] = -1; // default if no greater element found
            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > piv) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}