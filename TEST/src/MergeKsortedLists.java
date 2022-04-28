import java.util.PriorityQueue;

public class MergeKsortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(ListNode head : lists){
            while (head!=null){
                heap.add(head.val);
                head=head.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (!heap.isEmpty()){
            current.next = new ListNode(heap.poll());
            current = current.next;
        }
        return dummy.next;
    }
}
