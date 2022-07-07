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
        if(head==null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast !=null && slow != null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            if(fast==slow) {
              ListNode temp = slow;
              int length = 0;
              do{
                temp = temp.next;
                length++;
              }while(temp!=slow);
              return length;
            }
        }
        return false;
    }
}
