/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack <Integer> st = new Stack<>();
        ListNode temp = head;
        ListNode temp1 = head;

        while(temp != null){
            st.push(temp.val);
            if(st.size() == k){
                int steps = k;
                while(steps > 0){
                    temp1.val = st.pop();
                    temp1 = temp1.next;
                    steps--;
                }
            }
            temp = temp.next;
        }
        return head;

    }
}