package reorder_list__0143;

class Solution {
    public void reorderList(ListNode head) {
        if (head.next == null) {
            return;
        }

        ListNode slow = head, fast = head, preSlow = head;
        while (fast != null && fast.next != null) {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        preSlow.next = null;
        ListNode list1 = head, list2 = reverse(slow);

        while (list2 != null) {
            ListNode next = list1.next;
            list1.next = list2;
            list1 = list2;
            list2 = next;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head, prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
