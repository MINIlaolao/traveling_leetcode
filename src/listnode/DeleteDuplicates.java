package listnode;

/**
 * @author laoqixin    [qixin.lao@isee.work]
 * @date 2021/10/2 19:38
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode prev = newHead;
        while (prev != null) {
            if (prev.val == prev.next.val) {
                prev.next = prev.next.next;
            }
            prev = prev.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        System.out.println(deleteDuplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
    }
}
