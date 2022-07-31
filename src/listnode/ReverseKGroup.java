package listnode;

import listnode.struct.ListNode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/11/15 15:26
 * @description K 个一组翻转链表
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        //虚拟头结点
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        ListNode p = head;
        while (p != null) {
            int count = 0;
            ListNode q = p;
            while (q != null) {
                count++;
                if (count == k) {
                    //收集到数量为k的一组
                    break;
                }
                q = q.next;
            }
            if (q == null) {
                tail.next = p;
                return dummyHead.next;
            } else {
                //k不剩下的情况
                ListNode tmp = q.next;
                ListNode[] reverseList = reverse(p, q);
                //tail的next是指向源链表的尾部
                tail.next = reverseList[0];
                tail = reverseList[1];
                //p接上q
                p = tmp;
            }
        }
        return dummyHead.next;
    }

    private ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode newHead = null;
        ListNode p = head;

        while (p != tail) {
            ListNode tmp = p.next;
            p.next = newHead;
            newHead = p;
            p = tmp;
        }
        //翻转之后接回源链表
        tail.next = newHead;
        newHead = tail;
        //翻转过后只需把头尾调转返回
        return new ListNode[]{tail, head};
    }
}
