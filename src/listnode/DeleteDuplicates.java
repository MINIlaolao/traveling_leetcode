package listnode;

import listnode.struct.ListNode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/2 19:38
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        System.out.println(deleteDuplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        //输入的有可能是 0 所以不能用无参构造 int(type) default value = 0
        ListNode newHead = new ListNode(-1);
        ListNode tail = newHead;

        while (p != null) {
            ListNode tmp = p.next;
            if (p.val != tail.val) {
                tail.next = p;
                //tail指向p
                tail = p;
                //断开
                p.next = null;
            }
            p = tmp;
        }
        return newHead.next;
    }
}
