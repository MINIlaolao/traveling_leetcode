package listnode;

import listnode.struct.ListNode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/4 19:12
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        //不能用无参构造 有默认值
        ListNode newHead = null;
        ListNode p = head;

        while (p != null) {
            ListNode tmp = p.next;
            p.next = newHead;
            newHead = p;
            p = tmp;
        }
        return newHead;
    }
}
