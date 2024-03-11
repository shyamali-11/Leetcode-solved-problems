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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null)
         return head;
        int n=1;
        ListNode curr=head;
        while(curr.next!=null){
            n++;
            curr=curr.next;
        }
        if(k==n)
         return head;
        curr.next=head;
        curr=head;
        for(int i=1;i<(n-(k%n));i++){
            curr=curr.next;
        }
        ListNode newhead=null;
        newhead=curr.next;
        curr.next=null;
        return newhead;
    }
}