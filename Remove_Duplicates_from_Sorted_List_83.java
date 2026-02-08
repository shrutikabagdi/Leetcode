package Leetcode;

public class Remove_Duplicates_from_Sorted_List_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val ){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }
}
