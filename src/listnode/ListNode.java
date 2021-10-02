package listnode;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * TODO 头插入，尾插入，根据索引插入，根据索引删除,toString
 *
 * @author laoqixin    [qixin.lao@isee.work]
 * @date 2021/10/2 19:11
 */
public class ListNode {
    int val;
    ListNode next;
    private ListNode head = null;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode insertAfterHead(int val) {
        if (head == null) {
            head = new ListNode();
        }
        ListNode p = head;
        p.val = val;
        head.next = p;
        return head;
    }

    public ListNode insertBeforeEnd(int val) {
        if (head == null) {
            head = new ListNode();
        }
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new ListNode(val, null);
        return head;
    }

    public ListNode insert(int val, int k) {
        if (head == null) {
            head = new ListNode();
        }
        ListNode p = head;
        int count = 0;
        while (count >= k) {
            p = p.next;
            if (p == null) {
                return null;
            }
            count += 1;
        }
//        TODO
        return null;
    }

}
