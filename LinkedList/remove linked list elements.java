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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return head;
        }
        //Recursively remove the elements in the remaining linked list
        head.next = removeElements(head.next, val);
        //if the head's val is equal to the val then change the head's next to head.next.next else head.next 
        return head.val == val ? head.next : head;
    }
}
