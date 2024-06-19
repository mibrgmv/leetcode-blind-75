package merge_k_sorted_lists__0023;

import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (var l : lists) {
            while (l != null) {
                pq.add(l.val);
                l = l.next;
            }
        }

        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (!pq.isEmpty()) {
            temp.next = new ListNode(pq.remove());
            temp = temp.next;
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
