package Leetcode;

public class Remove_Linked_List_Elements_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode curr = head;
        ListNode prev = res;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return res.next;
    }
}
