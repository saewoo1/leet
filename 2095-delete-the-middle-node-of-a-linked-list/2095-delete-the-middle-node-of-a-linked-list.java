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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode len = head;
        int length = 0;
        while (len != null) {
            len = len.next;
            length++;
        }

        ListNode result = null;
        ListNode after = head;
        int i = 0;
        int mid = length / 2;

        while (after != null) {
            // 가운데 도착 시 다음 값으로 건너 뛰기
            if (i == mid) {
                result.next = after.next;
                i++;
            }
            else {
                result = after;
                after = after.next;
                i++;
            }
        }
        return head;
    }
}