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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0){
            return head;
        }
        // find the length

        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
         // Step 2: reduce rotations
        k = k % length;
        // make it circular

        temp.next = head;
        int tail = length-k;

        // check for tail

        ListNode newtail = temp;
        while (tail-- > 0){
            newtail = newtail.next;
        }

        // break the tail

         ListNode newHead = newtail.next;
        newtail.next = null;

        return newHead;
    }
}