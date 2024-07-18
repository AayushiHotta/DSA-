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
    // Function to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse both input linked lists
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        int carry = 0;

        // Add the two numbers
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
        }

        // Reverse the result list to get the correct order
        return reverse(dummyHead.next);
    }
}
