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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;//traverse the first list
        ListNode temp2 = l2;//to traverse the second list
        ListNode dummyHead = new ListNode(-1); // head of the result list
        
        ListNode curr = dummyHead; //create the result linked list
        int carry = 0;

        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null) sum += temp1.val;
            if(temp2 != null) sum += temp2.val;
            ListNode newNode = new ListNode(sum % 10); //add the last digit of the sum to the result

            carry = sum/10; //for example if sum = 10 then carry = 10/10 = 1
            curr.next = newNode; //add the newNode to the list
            curr = curr.next; //increment the pointer in the resultant node for the next addition

            if(temp1 != null) temp1 = temp1.next;//move to the next node in the first list
            if(temp2 != null) temp2 = temp2.next;//move to the next node in the second list
        }

        //if there is any remaining query, add to the result list
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return dummyHead.next;
    }
}
