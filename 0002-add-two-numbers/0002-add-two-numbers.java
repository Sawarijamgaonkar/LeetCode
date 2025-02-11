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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        ListNode newlist=temp;
        int total=0;
        int carry=0;
        while(l1!=null || l2!=null ||carry!=0){
            total=carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;
            }
            int num=total%10;
            carry=total/10;
            temp.next=new ListNode(num);
            temp=temp.next;
        }
        return newlist.next;  
            
    }

}