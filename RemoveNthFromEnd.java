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
class RemoveNthFromEnd 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head.next == null && n == 1)
            return head.next;
        ListNode temp_head=head;
        int size=0;
        while(temp_head != null)
        {
            size++;
            temp_head=temp_head.next;
        }
        temp_head = head;
        size = (size-n);
        ListNode prevnode=null;
        while(size>0)
        {
            prevnode=temp_head;
            temp_head=temp_head.next;
            size--;
        }
        if(prevnode == null)
        {
            return head.next;
        }
        if(temp_head!=null)
        prevnode.next=temp_head.next;
        return head;
    }
}
