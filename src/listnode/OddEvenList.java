package listnode;

/**
 * [ head>1>6>3>2>1>null ]
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/11/14 16:03
 * @description 奇偶链表
 * 思路:先拆出奇偶链表，再把奇偶链表合并
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        //奇数链表
        ListNode oddHead = new ListNode();
        ListNode tailOddList = oddHead;
        //偶数链表
        ListNode eventHead = new ListNode();
        ListNode tailEventList = eventHead;

        ListNode p = head;
        int count = 1;

        while (p != null) {
            boolean isOrderOdd = count % 2 == 1;
            ListNode tmp = p.next;
            if (isOrderOdd) {
                p.next = null;
                tailOddList.next = p;
                tailOddList = p;
            } else {
                p.next = null;
                tailEventList.next = p;
                tailEventList = p;
            }
            p = tmp;
            count += 1;
        }
        //奇数链表接偶数链表
        tailOddList.next = eventHead.next;
        //虚拟头结点
        return oddHead.next;
    }
}
