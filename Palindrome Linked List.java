//234. Palindrome Linked List
//https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
       slow=reverse(slow);
       
        fast=head;
     while(slow!=null)
     {
         if(fast.val!=slow.val)
             return false;
         slow=slow.next;
         fast=fast.next;
     }
    return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode result=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=result;
            result=head;
            head=temp;
        }
        return result;
    }
}
