class Solution {
    public int sumSubarrayMins(int[] nums) {
        int n = nums.length;
        final int MOD = 1_000_000_007;

        int[] left = new int[n];   // distance to previous strictly smaller element
        int[] right = new int[n];  // distance to next smaller-or-equal element

        Deque<Integer> stack = new ArrayDeque<>();

        // Compute left boundaries
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        stack.clear();

        // Compute right boundaries
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result = (result + (long) nums[i] * left[i] * right[i]) % MOD;
        }

        return (int) result;
    }
}