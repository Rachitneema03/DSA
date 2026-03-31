class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        // Step 1: Move first to kth node
        for(int i = 1; i < k; i++) {
            first = first.next;
        }

        // Step 2: Use temp to reach end
        temp = first;
        while(temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // Step 3: Swap values
        int t = first.val;
        first.val = second.val;
        second.val = t;

        return head;
    }
}