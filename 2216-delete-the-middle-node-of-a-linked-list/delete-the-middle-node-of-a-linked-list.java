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
    public ListNode deleteMiddle(ListNode head) {
      
        if(head.next == null) return null;

        ListNode t = head;
        int count = 0;
        while(t != null){
            count++;
            t = t.next;
        }

        int mid = count /2;
        ListNode p = head;
        ListNode n = head.next;
        count = 1;

        while(count < mid){
            p = p.next;
            n = n.next;
            count++;
        }
        p.next = n.next;
        return head;

    }
}