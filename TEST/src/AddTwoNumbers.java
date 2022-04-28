public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode p3 = dummy;
        int carry =0;
        while (p1!=null || p2!=null){
            if(p1!=null){
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry = carry/10;
        }
        if(carry>0){
            p3.next=new ListNode(carry%10);
        }
        return dummy.next;
    }
}
