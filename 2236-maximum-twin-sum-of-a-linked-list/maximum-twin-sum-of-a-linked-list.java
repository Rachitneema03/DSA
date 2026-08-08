class Solution {
    public int pairSum(ListNode head) {
        ListNode t = head;
        int count = 0;
        while (t != null) {
            count++;
            t = t.next;
        }
        int mid = count / 2;

        t = head;
        int steps = 0;
        while (steps < mid) {
            t = t.next;
            steps++;
        }

        ListNode rev = reverseList(t);

        t = head;
        int maxSum = 0;
        int i = 0;
        while (i < mid) {
            maxSum = Math.max(maxSum, t.val + rev.val);
            t = t.next;
            rev = rev.next;
            i++;
        }

        return maxSum;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}