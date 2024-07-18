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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Edge case: if the list is empty or left is equal to right, no need to reverse
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers
        ListNode leftPrev = dummy;
        ListNode curr = head;

        // Move the pointers to the starting position of the reverse
        for (int i = 0; i < left - 1; i++) {
            leftPrev = leftPrev.next;
            curr = curr.next;
        }

        // Reverse the sublist from left to right
        ListNode prev = null;
        ListNode currNext = null;
        for (int i = 0; i < right - left + 1; i++) {
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }

        // Connect the reversed sublist back to the original list
        leftPrev.next.next = curr; // `leftPrev.next` is now the node at `left`
        leftPrev.next = prev; // `prev` is now the node at `right`

        // Return the new head of the list
        return dummy.next;
    }
}
