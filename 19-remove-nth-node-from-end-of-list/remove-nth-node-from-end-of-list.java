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
        ListNode temp = head;
        int count = 0;
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }
        // Step 2: Calculate the length of the list
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        // Step 3: If the node to remove is the head
        if (count == n) {
            return head.next;  // Remove the head
        }
        // Step 4: Locate the node just before the one to remove
        int i = 1;
        temp = head;
        while (i < count - n) {
            temp = temp.next;
            i++;
        }
        // Step 5: Remove the nth node from the end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}