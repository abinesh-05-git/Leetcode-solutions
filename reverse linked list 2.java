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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = left-1, j = right-1;
        while(i<j){
            int a = arr.get(i);
            int b = arr.get(j);
            arr.set(i, b);
            arr.set(j, a);
            i++;
            j--;
        }
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        for(int p=0; p<arr.size(); p++){
            k.next = new ListNode(arr.get(p));
            k = k.next;
        }
        return dummy.next;
    }
}
