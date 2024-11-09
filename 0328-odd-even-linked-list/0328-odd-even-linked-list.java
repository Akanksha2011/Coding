/**/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode a = odd;
        ListNode b = even;
        for(int i=0; i<count; i++)
        {
            if(i%2 == 0)
            {
                a.next = head;
                a = a.next;
            }
            else
            {
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
       a.next = even.next;
       b.next = null;
       return odd.next;
    }
}