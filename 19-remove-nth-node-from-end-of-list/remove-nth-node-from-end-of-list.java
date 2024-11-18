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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        if(head.next==null){
            head=head.next;
            return head;
        }
        ListNode temp=new ListNode(0);
        ListNode temp2=new ListNode(0);
        temp2.next=head;
        temp.next=head;
        
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        if(size-n==0){
            head=head.next;
            return head;
        }
        for(int i=1;i<size-n;i++){
            head=head.next;
        }
        ListNode nodeToDelete=head.next;
        head.next=nodeToDelete.next;
        
        return temp2.next;
    }
}