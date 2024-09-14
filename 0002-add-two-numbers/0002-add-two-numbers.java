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
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        int digit1 = 0;
        int digit2 = 0;
        while(l1 != null || l2 != null || carry != 0)
        {
            if(l1 != null)
            {
                digit1 = l1.val;
                l1 = l1.next;
            }
            else
            {
                digit1 = 0;
            }
            if(l2 != null)
            {
                digit2 = l2.val;
                l2 = l2.next;
            }
            else
            {
                digit2 = 0;
            }
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            temp.next = newNode;
            temp = temp.next;    
        }
        ListNode res = dummy.next;
        dummy.next = null;
        return res;
    }
}