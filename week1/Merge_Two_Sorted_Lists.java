/*  Problem discription 
      They given two sorted array we need to print into a single sorted array
      Input: l1 = [1,2,4], l2 = [1,3,4]
      Output: [1,1,2,3,4,4]
     
       1)here am using recersive method . 
       2)inside the method first check the base condition.
       3)Using boolean am checking the l1 is smaller then l2 or not.
       4)if it smaller mean add that element in l1  to new list and increment the index of l1 , new list.
       5)else add l2 and increment the index of l2 , new list.
       6)finally return the new ArrayList.

*/




// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //  Base Case
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    
    ListNode res;
    boolean l1_is_smaller = (l1.val<l2.val);
    
    if( l1_is_smaller ){
        res = l1;   
        res.next = mergeTwoLists(l1.next,l2);
    }
    else{ 
        res = l2;   
        res.next = mergeTwoLists(l1,l2.next);
    }   
    
    return res;
    }
}
