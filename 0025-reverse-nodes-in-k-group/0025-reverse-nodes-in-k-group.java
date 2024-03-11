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
    public ListNode reverseKGroup(ListNode head, int k) {
         int count=0;
      ListNode curr=head;
      while(curr!=null){
          count++;
          curr=curr.next;
      }
         

         int[] a=new int[count];
         int i=0;

         curr=head;
         while(curr!=null){
               a[i++]=curr.val;
               curr=curr.next;
         }
         i=0;
         int p=k-1;
         curr=null;
        ListNode dummyhead=null;
         for(;p<a.length;i=p+1,p=p+k){
             for(int j=p;j>=i;j--){
              ListNode n=new ListNode(a[j]);
               if(dummyhead==null){
                   dummyhead=n;
                   curr=n;
               }
               else{
                   curr.next=n;
                   curr=curr.next;
               }
             }
         }
         if(i<a.length&&p>=a.length){
             for(int j=i;j<a.length;j++){
                ListNode n=new ListNode(a[j]);
               if(dummyhead==null){
                   dummyhead=n;
                   curr=n;
               }
               else{
                   curr.next=n;
                   curr=curr.next;
               } 
             }
         }
         return dummyhead;
    }
}