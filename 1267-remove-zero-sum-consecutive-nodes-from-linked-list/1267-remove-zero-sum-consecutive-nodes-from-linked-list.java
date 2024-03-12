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
    public ListNode removeZeroSumSublists(ListNode head) {
         if(head.val==0&&head.next==null){
           
            return null;
        }
        if(head.next==null&&head.val!=0)
         return head;
       
      

       head=remove(head);

     ListNode prev=null,curr=head,n=head;

      
       while(curr!=null){
          
               int sum=0;
           while(n!=null){
               
               sum+=n.val;
               if(sum==0){
                   if(curr==head)
                   {
                      if(n.next!=null){
                         head=n.next;
                         curr=head;
                         n=head;
                         sum=0;
                      }
                      else
                       return null;
                   }

                   else{
                          if(n.next!=null){
                              prev.next=n.next;
                              curr=n.next;
                              n=curr;
                          }
                          else
                            {     if(curr!=head){
                                 prev.next=null;
                                return head;
                                  }
                                  else{
                                      return null;
                                  }
                               
                            }
                   }
               }
               else
               n=n.next;
           }
           
           
           prev=curr;
           curr=curr.next;
           n=curr;
       }




 
       


      

       
        
       return head;
    }

    public ListNode remove(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==0){
                if(curr==head){
                    curr=curr.next;
                    head=curr;
                }
                else if(curr.next==null){
                    curr=null;
                    return head;
                }
                else{
                    curr.val=curr.next.val;
                    if(curr.next.next!=null){
                        curr.next=curr.next.next;
                    }
                    else{
                        curr.next=null;
                        return head;
                    }
                }
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
    }
