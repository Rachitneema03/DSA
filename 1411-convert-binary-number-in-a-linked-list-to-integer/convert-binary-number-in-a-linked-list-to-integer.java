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
    public int getDecimalValue(ListNode head) {
        ListNode t = head;
        int count = 0;
        int result = 0;
        int n = 0;

        while(t != null){
            n++;
            t = t.next;
        }

        int arr[] = new int[n];

        t = head;
        int i = 0;
        while (t != null) {
            arr[i++] = t.val;
            t = t.next;
        }
        int j = 0;
        for(int x = n-1 ; x >= 0 ; x--){
            result += arr[x] * Math.pow(2,j++);
        }

        return result;
    }
}