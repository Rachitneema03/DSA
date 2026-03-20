class Solution {
public:
    void deleteNode(ListNode* node) {
        // Копируем данные из следующего узла в текущий
        node->val = node->next->val;
        // Переставляем указатель, пропуская следующий узел
        node->next = node->next->next;
    }
}
;