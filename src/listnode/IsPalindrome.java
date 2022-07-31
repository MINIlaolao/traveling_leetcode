package listnode;

import listnode.struct.ListNode;

/**
 * 1.找到中间节点
 * 2.反转中间节点.next后的链表
 * 3.和前面链表进行比对
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/10/4 19:21
 * @description 判断回文串
 */
public class IsPalindrome {
    public static void main(String[] args) {
        ListNode testCase1 = new ListNode(1, new ListNode(2));
        IsPalindrome test = new IsPalindrome();
        System.out.println(test.isPalindrome(testCase1));
    }

    public boolean isPalindrome(ListNode head) {
        //1
        ListNode middleNextNode = middleNode(head);
        //2.
        ListNode reverseNode = reverseList(middleNextNode.next);
        //3.
        return isBothListNodeEqual(head, reverseNode);
    }

    private boolean isBothListNodeEqual(ListNode head, ListNode reverseNode) {
        if (head == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = reverseNode;
        //q不等于空 则只比较反转部分 不比较 middleNode=2的情况
        while (q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode middleNextNode) {
        if (middleNextNode == null) {
            return null;
        }
        //不能用无参构造 有默认值
        ListNode newHead = null;
        ListNode p = middleNextNode;

        while (p != null) {
            ListNode tmp = p.next;
            p.next = newHead;
            newHead = p;
            p = tmp;
        }
        return newHead;
    }

    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //往后移位 以防出现[1,2]的情况
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //偶数情况返回middle后面节点
        return slow;
    }
}
