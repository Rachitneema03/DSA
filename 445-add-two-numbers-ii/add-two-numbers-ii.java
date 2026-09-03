class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        ListNode t = l1;
        while (t != null) {
            st1.push(t.val);
            t = t.next;
        }
        t = l2;
        while (t != null) {
            st2.push(t.val);
            t = t.next;
        }

        int carry = 0;
        ListNode head = null; 

        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
            int a = st1.isEmpty() ? 0 : st1.pop();
            int b = st2.isEmpty() ? 0 : st2.pop();
            int sum = a + b + carry;
            carry = sum / 10;
            int digit = sum % 10;

            ListNode node = new ListNode(digit);
            node.next = head;
            head = node;
        }

        return head;
    }
}