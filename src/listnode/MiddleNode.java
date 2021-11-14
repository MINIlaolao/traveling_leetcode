package listnode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/2 19:10
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
