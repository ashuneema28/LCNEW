public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p3 =dummy;
        while (list1!=null && list2 !=null){
            if(list1.val<list2.val){
                p3.next = new ListNode(list1.val);
                list1=list1.next;
            }
            else {
                p3.next = new ListNode(list2.val);
                list2=list2.next;
            }
            p3=p3.next;
        }
        while (list1!=null){
            p3.next = new ListNode(list1.val);
            list1=list1.next;
            p3=p3.next;
        }
        while (list2!=null){
            p3.next = new ListNode(list2.val);
            list2=list2.next;
            p3=p3.next;
        }
        return dummy.next;
    }
}
