package codingInterviews;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成 "%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 10000
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2022/7/31 22:57
 * @description TODO
 */
public class ReplaceSpace {

    public String replaceSpace1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 动态扩容
     *
     * @param s
     * @return
     */
    public String replaceSpace2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        char[] res = new char[s.length() + count * 2];

        int resIndex = res.length - 1;
        //反着遍历
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                res[resIndex--] = '0';
                res[resIndex--] = '2';
                res[resIndex--] = '%';
            } else {
                res[resIndex--] = s.charAt(i);
            }
        }
        return new String(res);
    }

}
