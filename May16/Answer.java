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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
        {
            return null;
        }
        
        if(head.next == null || head.next.next == null)
        {
            return head;    
        }
        
        ListNode p1Head = head;
        ListNode p1Temp = p1Head;
        
        ListNode p2Head = head.next;
        ListNode p2Temp = p2Head;
        
        while(p2Temp != null && p2Temp.next != null)
        {
            p1Temp.next = p2Temp.next;
            p1Temp = p1Temp.next;
            
            p2Temp.next = p1Temp.next;
            p2Temp = p2Temp.next;
        }
        
        p1Temp.next = p2Head;
        
        return p1Head;
    }
}