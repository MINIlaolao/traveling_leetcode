package listnode;

/**
 * TODO 头插入，尾插入，根据索引插入，根据索引删除,toString
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/2 19:11
 */
public class ListNode {
    public int val;
    public ListNode next;
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


    /**
     * 创建多节点链表
     * TODO
     *
     * @param vals 参数 多选
     */
    ListNode(int... vals) {
//        ListNode newHead = new ListNode();
//        ListNode p = newHead;
//        for (int i = 0; i < vals.length; i++) {
//            ListNode tmp = p.next;
//            p.val = vals[i];
//            p.next = null;
//            this.val = p.val;
//        }
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
