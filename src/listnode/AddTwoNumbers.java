package listnode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/4 17:12
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode newHead = new ListNode();
        ListNode tail = newHead;

        int carry = 0;

        while (p != null || q != null) {
            int sum = 0;
            if (p != null) {
                sum += p.val;
                p = p.next;
            }
            if (q != null) {
                sum += q.val;
                q = q.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            ListNode addNode = new ListNode(sum % 10);
            //下个循环加上carry
            carry = sum / 10;
            tail.next = addNode;
            //进位
            tail = tail.next;
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return newHead.next;
    }
}
