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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==1){
            head=null;
            return head;
        }
        int mid = len/2;
        temp =head;
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}