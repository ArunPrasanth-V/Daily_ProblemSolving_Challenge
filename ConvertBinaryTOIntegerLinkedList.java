//1290. Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        for(ListNode node=head;node!=null;node=node.next){
            ans=(ans<<1)+node.val;
        }
        return ans;
    }
}
