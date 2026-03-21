/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) {
        ListNode *t = head;
        int result = 0;
        int n = 0;

        while(t != nullptr){
            n++;
            t = t->next;
        }

        int arr[n];

        t = head;
        int i = 0;
        while (t != nullptr) {
            arr[i++] = t->val;
            t = t->next;
        }
        int j = 0;
        for(int x = n-1 ; x >= 0 ; x--){
            result += arr[x] * pow(2,j++);
        }

        return result;
    }
};