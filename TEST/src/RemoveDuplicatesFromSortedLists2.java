public class RemoveDuplicatesFromSortedLists2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-111);
        dummy.next=head;
        ListNode previous = dummy;
        while (head!=null){
            if(head.next!=null && head.next.val==head.val){
                while (head.next!=null && head.next.val==head.val){
                    head=head.next;
                }
                previous.next=head.next;
            }
            else {
                previous = previous.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
