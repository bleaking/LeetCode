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
    public ListNode mergeNodes(ListNode head) {
        ListNode head2=null;
        ListNode r=null;
        ListNode p=head;
        ListNode temp=null;
        while(p.next!=null){
            if(p.val!=0){
                temp.val=temp.val+p.val;
            }else{
                temp=new ListNode();
                temp.val=0;
                if(head2==null){
                    head2=temp;
                    r=head2;
                }
                r.next=temp;
                r=r.next;
            }
            p=p.next;
        }
        if(head2.next==head2){
            head2.next=null;
        }
        return head2;
    }
}
