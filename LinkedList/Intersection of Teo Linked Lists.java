/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Write your code here
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while(a!=b){
            a = a == null ? headA : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }
}
