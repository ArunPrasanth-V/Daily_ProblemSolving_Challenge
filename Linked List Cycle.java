// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode fastPointer=head;
       ListNode slowPointer=head;
       while(fastPointer!=null && fastPointer.next!=null)
       {
           fastPointer=fastPointer.next.next;
           slowPointer=slowPointer.next;
           if(fastPointer==slowPointer)
               return true;
       }
        return false;
    }
}
