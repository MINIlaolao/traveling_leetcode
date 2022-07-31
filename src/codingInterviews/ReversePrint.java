package codingInterviews;

import listnode.ListNode;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2022/8/1 00:16
 * @description TODO
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        //获取链表长度
        ListNode temp = head;
        int count = 0;
        //统计链表节点数，顺便获取尾节点
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] res = new int[count];
        int resIndex = count - 1;
        while (head != null) {
            res[resIndex--] = head.val;
            head = head.next;
        }
        return res;
    }
}
