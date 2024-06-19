package remove_nth_node_from_end_of_list__0019;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode toRemove = temp;
        int steps = 0;

        while (head != null) {
            head = head.next;
            if (steps >= n) {
                toRemove = toRemove.next;
            }
            ++steps;
        }

        toRemove.next = toRemove.next.next;
        return temp.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
