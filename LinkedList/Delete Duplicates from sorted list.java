/* Intuition: traverse to every node and compare it's value with the value of it's next node's value
    if they are equal then assign the node.next = node.next.next i.e skip the duplicate node
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }
}
