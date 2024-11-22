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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int sz = 0;
         if(head == null || head.next == null)
        {
            return null;
        }
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }
        sz = sz/2;
        int j=1;
        ListNode pre = head;
        while(j<sz)
        {
            pre = pre.next;
            j++;
        }
        pre.next = pre.next.next;
        return head;
    }
}