//https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null)
        return head;
        
        ListNode node1=head;
        ListNode node3=head;
        int size=0;
        head=head.next;
        while(node1!=null &&node1.next!=null)
        {
         ListNode node2=node1.next;   
         node1.next=node2.next;
         node2.next=node1;
         if(size>0)
         {
            node3.next=node2;
            node3=node1;
          }
          size++;
          node1=node1.next;
        }
        return head;
    }
}
