package listnode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/2 18:06
 */
public class RemoveElements {


    public ListNode removeElements1(ListNode head, int val) {
        //拿到head内存地址
        ListNode prew = head;
        //next节点为空即到链尾
        while (prew.next != null) {
            if (prew.next.val == val) {
                //从前驱节点删除对应节点
                prew.next = prew.next.next;
            } else {
                //遍历
                prew = prew.next;
            }
        }
        //头指针为要要删除的值
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }


    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        //拿到head内存地址
        ListNode newHead = new ListNode();
        newHead.next = head;
        //从头结点开始遍历，不会跳过头结点了
        ListNode prew = newHead;
        //next节点为空即到链尾
        while (prew.next != null) {
            if (prew.next.val == val) {
                //从前驱节点删除对应节点
                prew.next = prew.next.next;
            } else {
                //遍历
                prew = prew.next;
            }
        }
        /*
        //头指针为要要删除的值
        if (head.val == val) {
            head = head.next;
        }*/
        return newHead.next;
    }


}
