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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
        return head;
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
          count++;
          temp = temp.next;
        }
        ListNode h2 = head;
        k = k%count;
        if(k == 0)
        return head;
        for(int i=1; i<count-k; i++)
        {
            h2 = h2.next;
        }
        ListNode ans = h2.next;
        ListNode h = h2.next;
        h2.next = null;
        while(h.next != null)
        {
            h = h.next;
        }
        h.next = head;
        return ans;
    }
}