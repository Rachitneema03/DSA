class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Deque<Integer> stack1 = new ArrayDeque<>(); // waiting for 1st greater
        Deque<Integer> stack2 = new ArrayDeque<>(); // waiting for 2nd greater

        for (int i = 0; i < n; i++) {
            // resolve indices waiting for their SECOND greater element
            while (!stack2.isEmpty() && nums[stack2.peek()] < nums[i]) {
                result[stack2.pop()] = nums[i];
            }

            // move indices from stack1 (just found 1st greater) into stack2
            List<Integer> temp = new ArrayList<>();
            while (!stack1.isEmpty() && nums[stack1.peek()] < nums[i]) {
                temp.add(stack1.pop());
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                stack2.push(temp.get(j));
            }

            stack1.push(i);
        }

        return result;
    }
}