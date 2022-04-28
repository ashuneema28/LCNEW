public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second =dummy;
        int length;
        for(length=0; first.next!=null ; length++){
            first=first.next;
        }
        for(int j=length-(k%length);j>0;--j){
            second = second.next;
        }
        first.next=dummy.next;
        dummy.next=second.next;
        second.next=null;

        return dummy.next;
    }
}
