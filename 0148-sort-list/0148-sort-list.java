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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        return head;
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left,right);
    }
    private ListNode getMiddle(ListNode head)
    {
        if(head == null)
        return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode left, ListNode right)
    {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(left != null && right != null)
        {
            if(left.val <= right.val)
            {
                curr.next = left;
                left = left.next;
            }
            else
            {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if(left != null)
        {
            curr.next = left;
        }
        else
        {
            curr.next = right;
        }
        return dummy.next;
    }
}