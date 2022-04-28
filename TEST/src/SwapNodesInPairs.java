public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode current = dummy;
        ListNode fisrt;
        ListNode second;
        while (current.next!=null && current.next.next!=null){
            fisrt = current.next;
            second = current.next.next;
            fisrt.next=second.next;
            second.next=fisrt;
            current.next=second;
            current = fisrt;
        }
        return dummy.next;
    }
}
